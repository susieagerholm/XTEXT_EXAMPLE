/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.ROBOT:
      {
        Robot robot = (Robot)theEObject;
        T result = caseRobot(robot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TOPOLOGY:
      {
        Topology topology = (Topology)theEObject;
        T result = caseTopology(topology);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINK_DECORATOR:
      {
        LinkDecorator linkDecorator = (LinkDecorator)theEObject;
        T result = caseLinkDecorator(linkDecorator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LINK_REF:
      {
        LinkRef linkRef = (LinkRef)theEObject;
        T result = caseLinkRef(linkRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.JOINT:
      {
        Joint joint = (Joint)theEObject;
        T result = caseJoint(joint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.JOINT_REF:
      {
        JointRef jointRef = (JointRef)theEObject;
        T result = caseJointRef(jointRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INERTIAL:
      {
        Inertial inertial = (Inertial)theEObject;
        T result = caseInertial(inertial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INERTIA:
      {
        Inertia inertia = (Inertia)theEObject;
        T result = caseInertia(inertia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VISUAL:
      {
        Visual visual = (Visual)theEObject;
        T result = caseVisual(visual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COLLISION:
      {
        Collision collision = (Collision)theEObject;
        T result = caseCollision(collision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ORIGIN:
      {
        Origin origin = (Origin)theEObject;
        T result = caseOrigin(origin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MASS:
      {
        Mass mass = (Mass)theEObject;
        T result = caseMass(mass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobot(Robot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Topology</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Topology</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopology(Topology object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Decorator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Decorator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkDecorator(LinkDecorator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkRef(LinkRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoint(Joint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Joint Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joint Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJointRef(JointRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inertial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inertial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInertial(Inertial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inertia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inertia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInertia(Inertia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisual(Visual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollision(Collision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Origin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Origin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrigin(Origin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMass(Mass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch