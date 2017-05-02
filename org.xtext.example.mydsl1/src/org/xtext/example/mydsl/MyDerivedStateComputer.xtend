package org.xtext.example.mydsl

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.xtext.example.mydsl.myDsl.VariableDefinition
import org.xtext.example.mydsl.myDsl.DefinitionBlock

class MyDerivedStateComputer implements IDerivedStateComputer {
  
  override discardDerivedState(DerivedStateAwareResource resource) {
    resource.allContents.filter(typeof(VariableDefinition)).forEach [
      type = null
    ]
  }
  
  override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
    resource.allContents.filter(typeof(VariableDefinition)).forEach [
      type = (eContainer as DefinitionBlock).type
    ]
  }
  
}