package org.xtext.example.mydsl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.xtext.example.mydsl.myDsl.Joint;
import org.xtext.example.mydsl.myDsl.JointType;
import org.xtext.example.mydsl.myDsl.Link;
import org.xtext.example.mydsl.myDsl.LinkDecorator;
import org.xtext.example.mydsl.myDsl.LinkRef;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.Robot;
import org.xtext.example.mydsl.myDsl.Topology;

class MyDslDerivedStateComputer implements IDerivedStateComputer {
	
	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		//how to discard: remove all ref to demanded links and edges from topo?
		TreeIterator<EObject> temp = resource.getAllContents();
		while (temp.hasNext()) {
			EObject obj = temp.next();
			if (obj instanceof Topology) {
				obj.eContents().clear();

//				Topology topo = (Topology)obj;
//				topo.setParent(null);
//				topo.setChild(null);
//				topo.setJoint(null);
			}
		}
	}
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if  (!preLinkingPhase) {   
			installTopology(resource);
		}
	}
	
	public void installLinkDecoration(DerivedStateAwareResource resource) {
		while(resource.getAllContents().hasNext()) {
			Object obj = resource.getAllContents().next();
			if(obj instanceof Robot) {
				Robot rob = (Robot)obj;
				EList<LinkRef> refs = rob.getLinkrefs();
				for (int i = 0; i < refs.size(); i++) {
					LinkRef ref = refs.get(i);
					LinkDecorator dec = MyDslFactory.eINSTANCE.createLinkDecorator();
					ref.setDecorator(dec);
				}
			}
		}
	}
	
	public void installTopology(DerivedStateAwareResource resource) {
		TreeIterator<EObject> temp = resource.getAllContents();
		boolean stop = false;
		while (temp.hasNext() || stop) {
			EObject obj = temp.next();
			// When we have found mr. robot we can stop the top loop as there can be only one
			if (obj instanceof Robot) {
				Robot rob = (Robot)obj;
				stop = true;
				TreeIterator<EObject> eo = rob.eAllContents();
				while(eo.hasNext()) {
					EObject top = eo.next();
					if (top instanceof Topology) {
						Topology topo = (Topology)top;
						if(topo.getChild() != null && topo.getParent() != null) {
							if(!getLastEntry(top).equals(" "))
									return;  // we havent finished writing
							EList<Link> links = rob.getLink();
							boolean found = false;
							boolean childFound = false;
							for (Link l : links) {
								if(l.getName().equals(getNodeText(topo, 1))) {
									found = true;
								}
								if(l.getName().equals(getNodeText(topo.getChild(), 1))) {
									childFound = true;
								}
							}

							if(!found) {
								Link newLink = MyDslFactory.eINSTANCE.createLink();
								newLink.setName(getNodeText(topo, 1));
								rob.getLink().add(newLink);
							}
							
							if(!childFound) {
								Link newLink2 = MyDslFactory.eINSTANCE.createLink();
								newLink2.setName(getNodeText(topo.getChild(), 1));
								rob.getLink().add(newLink2);
							}
							
							Joint aJoint = MyDslFactory.eINSTANCE.createJoint();
							aJoint.setName(topo.getParent().getName() + "_" + getNodeText(topo.getChild(), 1));
							aJoint.setChildOf(topo.getParent());
							aJoint.setParentOf(topo.getChild().getParent());

							rob.getJoint().add(aJoint);
							
							if (topo.getJoint().getRev() != null) {
								topo.getJoint().setRev(JointType.REVOLUTE.toString());
							} else if(topo.getJoint().getPris() != null) {
								topo.getJoint().setPris(JointType.PRISMATIC.toString());
							} else if(topo.getJoint().getCont() != null) {
								topo.getJoint().setCont(JointType.CONTINUOUS.toString());
							} else {
								topo.getJoint().setFix(JointType.FIXED.toString());
							}
						}
					}
				}
			}
		}
	}
	
	private String getLastEntry(EObject obj) {
		if (NodeModelUtils.getNode(obj) != null) {
			String text = NodeModelUtils.getNode(obj).getRootNode().getText();
			char temp = text.toCharArray()[text.length()-1];
			return String.valueOf(temp);
		}
		return null;
	}

	public String getNodeText(EObject obj, int no) {
   	  if (NodeModelUtils.getNode(obj) != null) {
		  Iterable<ILeafNode> it = NodeModelUtils.getNode(obj).getLeafNodes();
		  int i = 0;
		  for(ILeafNode s: it){
			  if (i==no) {
				return s.getText();
			  }
			  i++;
	      }
   	  }
	  return "";
	}
	
}