/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydot.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;
import org.xtext.example.mydot.MyDotRuntimeModule;
import org.xtext.example.mydot.ui.MyDotUiModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MydotActivator extends AbstractUIPlugin {

	public static final String ORG_XTEXT_EXAMPLE_MYDOT_MYDOT = "org.xtext.example.mydot.MyDot";
	
	private static final Logger logger = Logger.getLogger(MydotActivator.class);
	
	private static MydotActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static MydotActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (ORG_XTEXT_EXAMPLE_MYDOT_MYDOT.equals(grammar)) {
			return new MyDotRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (ORG_XTEXT_EXAMPLE_MYDOT_MYDOT.equals(grammar)) {
			return new MyDotUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
