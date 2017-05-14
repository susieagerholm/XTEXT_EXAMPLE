/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl4.myDsl.Joint;
import org.xtext.example.mydsl4.myDsl.JointType;
import org.xtext.example.mydsl4.myDsl.Link;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointImpl#getChildOf <em>Child Of</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointImpl#getParentOf <em>Parent Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends MinimalEObjectImpl.Container implements Joint
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final JointType TYPE_EDEFAULT = JointType.FIXED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JointType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildOf() <em>Child Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildOf()
   * @generated
   * @ordered
   */
  protected Link childOf;

  /**
   * The cached value of the '{@link #getParentOf() <em>Parent Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentOf()
   * @generated
   * @ordered
   */
  protected Link parentOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JointImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.JOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JointType newType)
  {
    JointType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link getChildOf()
  {
    if (childOf != null && childOf.eIsProxy())
    {
      InternalEObject oldChildOf = (InternalEObject)childOf;
      childOf = (Link)eResolveProxy(oldChildOf);
      if (childOf != oldChildOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.JOINT__CHILD_OF, oldChildOf, childOf));
      }
    }
    return childOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link basicGetChildOf()
  {
    return childOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildOf(Link newChildOf)
  {
    Link oldChildOf = childOf;
    childOf = newChildOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT__CHILD_OF, oldChildOf, childOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link getParentOf()
  {
    if (parentOf != null && parentOf.eIsProxy())
    {
      InternalEObject oldParentOf = (InternalEObject)parentOf;
      parentOf = (Link)eResolveProxy(oldParentOf);
      if (parentOf != oldParentOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.JOINT__PARENT_OF, oldParentOf, parentOf));
      }
    }
    return parentOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link basicGetParentOf()
  {
    return parentOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentOf(Link newParentOf)
  {
    Link oldParentOf = parentOf;
    parentOf = newParentOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT__PARENT_OF, oldParentOf, parentOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.JOINT__NAME:
        return getName();
      case MyDslPackage.JOINT__TYPE:
        return getType();
      case MyDslPackage.JOINT__CHILD_OF:
        if (resolve) return getChildOf();
        return basicGetChildOf();
      case MyDslPackage.JOINT__PARENT_OF:
        if (resolve) return getParentOf();
        return basicGetParentOf();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.JOINT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.JOINT__TYPE:
        setType((JointType)newValue);
        return;
      case MyDslPackage.JOINT__CHILD_OF:
        setChildOf((Link)newValue);
        return;
      case MyDslPackage.JOINT__PARENT_OF:
        setParentOf((Link)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.JOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.JOINT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslPackage.JOINT__CHILD_OF:
        setChildOf((Link)null);
        return;
      case MyDslPackage.JOINT__PARENT_OF:
        setParentOf((Link)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.JOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.JOINT__TYPE:
        return type != TYPE_EDEFAULT;
      case MyDslPackage.JOINT__CHILD_OF:
        return childOf != null;
      case MyDslPackage.JOINT__PARENT_OF:
        return parentOf != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", Type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //JointImpl
