package org.xtext.example.mydsl

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.xtext.example.mydsl.myDsl.JointType
import org.xtext.example.mydsl.myDsl.LinkRef
import org.xtext.example.mydsl.myDsl.MyDslFactory
import org.xtext.example.mydsl.myDsl.Robot
import org.xtext.example.mydsl.myDsl.Topology

class MyDslDerivedStateComputer implements IDerivedStateComputer {
	
	override discardDerivedState(DerivedStateAwareResource resource) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		//how to discard: remove all ref to demanded links and edges from topo?
		resource.allContents.filter(Topology).forEach[ topo |
			//set all created refs to zero??
			topo.setParent(null);
			topo.setChild(null);
			topo.joint == null
		]
		/*resource.allContents.filter(LinkRef).forEach[ l_ref |
			l_ref.decorator = null
		]*/
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		//WHAT PHASE SHOULD WE DO THIS - DOES NOT WORK IF IN PRELINKING PHASE???
		//1. parsing elements, 2. indexing = processing content of EMF, 3. Linking = resolve cross ref
		//?: Relation to validation - so we do not create invalid topos??
		
		if  (!preLinkingPhase) {   
			installTopology(resource)
			//installLinkDecoration(resource)			
		}
	}
	
	def installLinkDecoration(DerivedStateAwareResource resource) {
		resource.allContents.filter(Robot).forEach[ robo | 
			robo.linkrefs.forEach[l_ref |
				//CREATE NEW DECORATOR
				l_ref.ref.decorator = MyDslFactory.eINSTANCE.createLinkDecorator => [				
			   		if(inert != null) {
			   			//How the FCK!!??	
			   		}
			   	];	
			]
			
		]
	}
	
	def installTopology(DerivedStateAwareResource resource) {
		//traverse Topology...should probably be reversed??
		//how to get reference to robot
		resource.allContents.filter(Robot).forEach[ robo | 
				robo.eAllContents.filter(Topology).forEach[topo |
					if (topo.child.parent != null) {
						if(!robo.link.exists[x | 
							x.name.equals(getNodeText(topo, 1))]) {
								robo.link.add(	
									//create new Link from parent (if not already exists)
			   						MyDslFactory.eINSTANCE.createLink => [
			   						//needs to be improved or fail safed - secure WS in model.dsl!
			   						name = getNodeText(topo, 1)
			   				]);	
						}
						if(!robo.link.exists[x | 
							x.name.equals(getNodeText(topo.child, 1))]) {
								robo.link.add(	
			   						MyDslFactory.eINSTANCE.createLink => [ 
			   							name = getNodeText(topo.child, 1)
			   					]);	
						}
						//CHECK IF JOINT ALREADY EXISTS!! HOW?? 
						//if(!robo.joint.exists[x | x.childOf.equals(topo.parent) && x.parentOf.equals(topo.child.parent)]) {}
							robo.joint.add(
				   				MyDslFactory.eINSTANCE.createJoint => [
									//concatenate name of parent and child link for unique key...
									name = topo.parent.name + "_" + getNodeText(topo.child, 1)
									childOf = topo.parent
									parentOf = topo.child.parent
									//how do we get the reference to joint type
									switch topo.joint {
										case topo.joint.rev != null : type = JointType.REVOLUTE
										case topo.joint.pris != null : type = JointType.PRISMATIC 
										case topo.joint.cont != null : type = JointType.CONTINUOUS 
										default: type = JointType.FIXED
									}
				   			]);
				   		}
				]
		 ]
	}
	
	def String getNodeText(EObject obj, int no) {
		NodeModelUtils.getNode(obj).leafNodes.get(no).text
	}
	
}