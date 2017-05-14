/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl4.myDsl.JointRef;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;
import org.xtext.example.mydsl4.myDsl.Topology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.TopologyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.TopologyImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.TopologyImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyImpl extends MinimalEObjectImpl.Container implements Topology
{
  /**
   * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected static final String PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected String parent = PARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoint()
   * @generated
   * @ordered
   */
  protected JointRef joint;

  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected Topology child;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopologyImpl()
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
    return MyDslPackage.Literals.TOPOLOGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(String newParent)
  {
    String oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPOLOGY__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JointRef getJoint()
  {
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoint(JointRef newJoint, NotificationChain msgs)
  {
    JointRef oldJoint = joint;
    joint = newJoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPOLOGY__JOINT, oldJoint, newJoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoint(JointRef newJoint)
  {
    if (newJoint != joint)
    {
      NotificationChain msgs = null;
      if (joint != null)
        msgs = ((InternalEObject)joint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPOLOGY__JOINT, null, msgs);
      if (newJoint != null)
        msgs = ((InternalEObject)newJoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPOLOGY__JOINT, null, msgs);
      msgs = basicSetJoint(newJoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPOLOGY__JOINT, newJoint, newJoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topology getChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(Topology newChild, NotificationChain msgs)
  {
    Topology oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPOLOGY__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(Topology newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPOLOGY__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOPOLOGY__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOPOLOGY__CHILD, newChild, newChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.TOPOLOGY__JOINT:
        return basicSetJoint(null, msgs);
      case MyDslPackage.TOPOLOGY__CHILD:
        return basicSetChild(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.TOPOLOGY__PARENT:
        return getParent();
      case MyDslPackage.TOPOLOGY__JOINT:
        return getJoint();
      case MyDslPackage.TOPOLOGY__CHILD:
        return getChild();
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
      case MyDslPackage.TOPOLOGY__PARENT:
        setParent((String)newValue);
        return;
      case MyDslPackage.TOPOLOGY__JOINT:
        setJoint((JointRef)newValue);
        return;
      case MyDslPackage.TOPOLOGY__CHILD:
        setChild((Topology)newValue);
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
      case MyDslPackage.TOPOLOGY__PARENT:
        setParent(PARENT_EDEFAULT);
        return;
      case MyDslPackage.TOPOLOGY__JOINT:
        setJoint((JointRef)null);
        return;
      case MyDslPackage.TOPOLOGY__CHILD:
        setChild((Topology)null);
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
      case MyDslPackage.TOPOLOGY__PARENT:
        return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
      case MyDslPackage.TOPOLOGY__JOINT:
        return joint != null;
      case MyDslPackage.TOPOLOGY__CHILD:
        return child != null;
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
    result.append(" (parent: ");
    result.append(parent);
    result.append(')');
    return result.toString();
  }

} //TopologyImpl