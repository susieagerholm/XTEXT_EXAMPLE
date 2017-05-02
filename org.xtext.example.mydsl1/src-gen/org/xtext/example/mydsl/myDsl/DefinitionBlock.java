/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DefinitionBlock#getVariableDefinitions <em>Variable Definitions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DefinitionBlock#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDefinitionBlock()
 * @model
 * @generated
 */
public interface DefinitionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.VariableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Definitions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDefinitionBlock_VariableDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<VariableDefinition> getVariableDefinitions();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDefinitionBlock_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DefinitionBlock#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // DefinitionBlock