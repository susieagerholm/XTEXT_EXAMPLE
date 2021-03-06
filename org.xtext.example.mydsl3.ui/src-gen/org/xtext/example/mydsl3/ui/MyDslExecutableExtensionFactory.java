/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl3.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mydsl3.ui.internal.Mydsl3Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Mydsl3Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Mydsl3Activator.getInstance().getInjector(Mydsl3Activator.ORG_XTEXT_EXAMPLE_MYDSL3_MYDSL);
	}
	
}
