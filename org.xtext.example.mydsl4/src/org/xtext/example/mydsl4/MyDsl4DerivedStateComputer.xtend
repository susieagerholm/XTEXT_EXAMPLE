package org.xtext.example.mydsl4

import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.xtext.example.mydsl4.myDsl.JointType
import org.xtext.example.mydsl4.myDsl.Link
import org.xtext.example.mydsl4.myDsl.MyDslFactory
import org.xtext.example.mydsl4.myDsl.Robot
import org.xtext.example.mydsl4.myDsl.Topology
import org.xtext.example.mydsl4.myDsl.JointRef

class MyDsl4DerivedStateComputer implements IDerivedStateComputer {
	
	override discardDerivedState(DerivedStateAwareResource resource) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		//how to discard: remove all ref to demanded links and edges from topo?
		resource.allContents.filter(Topology).forEach[ topo |
			//set all created refs to zero??
			topo.setParent(null);
			topo.setChild(null);
			topo.joint == null
		]
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		//WHAT PHASE SHOULD WE DO THIS - DOES NOT WORK IF IN PRELINKING PHASE???
		//1. parsing elements, 2. indexing = processing content of EMF, 3. Linking = resolve cross ref
		//?: Relation to validation - so we do not create invalid topos??
		
		if  (!preLinkingPhase) {   
			//traverse Topology...should probably be reversed
			//how to get reference to robot
			resource.allContents.filter(Robot).forEach[ robo | 
				robo.eAllContents.filter(Topology).forEach[topo |
					if (topo.parent != null && 
						!robo.eAllContents.filter(Link).exists[x | 
							x.name.equals(topo.parent.toString())
						]
					) {
						robo.link.add(	
						//create new Link from parent (if not already exists)
			   				MyDslFactory.eINSTANCE.createLink => [
			   					//how to get name of ID??
								name = topo.parent.toString();
			   			]);
					}
					if(topo.child != null && 
						!robo.eAllContents.filter(Link).exists[x 
							| x.name.equals(topo.child.parent.toString())
						]
					) {
			   		robo.link.add(
						MyDslFactory.eINSTANCE.createLink => [
							name = topo.child.parent.toString() 
			   			]
			   		);
			   		}
			   		if(topo.joint != null) {
			   		robo.joint.add(
				   		MyDslFactory.eINSTANCE.createJoint => [
							//concatenate name of parent and child link for unique key...
							name = topo.parent.toString() + "_" + topo.child.parent.toString()
							// topo.parent.name + "__" + topo.child.head.name
							//how do we get the reference to joint type
							if (topo.joint.fix != null) { type = JointType.FIXED }
							else if (topo.joint.rev != null) { type = JointType.REVOLUTE }
							else if (topo.joint.pris != null) { type = JointType.PRISMATIC }
							else { type = JointType.CONTINUOUS }
							/*switch(topo.joint.eGet(JointRef)) {
								case '->': type = JointType.FIXED
	                     		case 'r->': type = JointType.REVOLUTE
	                     		case 'p->': type = JointType.PRISMATIC
	                     		case 'c->': type = JointType.CONTINUOUS
							}*/
				   		]);
			   		}		
				]
			 ]	
				
		}
	}
	
}