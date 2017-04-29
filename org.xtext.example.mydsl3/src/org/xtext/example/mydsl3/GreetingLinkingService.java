package org.xtext.example.mydsl3;

//package org.example.dsl;

import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.xtext.example.mydsl3.myDsl.MyDslFactory;
import org.xtext.example.mydsl3.myDsl.MyDslPackage;
import org.xtext.example.mydsl3.myDsl.Person;

public class GreetingLinkingService extends DefaultLinkingService {
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node)
			throws IllegalNodeException {
		List<EObject> list = super.getLinkedObjects(context, ref, node);

		if (!list.isEmpty()) {
			return list;
		}
		
		String name = node.getText();
		// create a dummy URI with the DSL's file extension
		URI uri = URI.createURI("dummy:/" + name + ".mydsl3");
		ResourceSet resourceSet = context.eResource().getResourceSet();
		Resource resource = resourceSet.getResource(uri, false);
		Person person;

		if (resource == null) {
			MyDslFactory factory = MyDslPackage.eINSTANCE.getMyDslFactory();	
			person = factory.eINSTANCE.createPerson();
			System.out.println("lala");
			person.setName(name);
			resource = resourceSet.createResource(uri);
			List<EObject> contents = resource.getContents();
			contents.add(person);
		} else {
			person = (Person) resource.getContents().get(0);
		}

		return Collections.singletonList((EObject)person);
	}
}

