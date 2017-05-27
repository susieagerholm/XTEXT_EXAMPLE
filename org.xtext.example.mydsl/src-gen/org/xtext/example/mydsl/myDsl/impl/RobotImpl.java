/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Joint;
import org.xtext.example.mydsl.myDsl.Link;
import org.xtext.example.mydsl.myDsl.LinkRef;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Robot;
import org.xtext.example.mydsl.myDsl.Topology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getTopologies <em>Topologies</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RobotImpl#getLinkrefs <em>Linkrefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot
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
   * The cached value of the '{@link #getTopologies() <em>Topologies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopologies()
   * @generated
   * @ordered
   */
  protected EList<Topology> topologies;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected EList<Link> link;

  /**
   * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoint()
   * @generated
   * @ordered
   */
  protected EList<Joint> joint;

  /**
   * The cached value of the '{@link #getLinkrefs() <em>Linkrefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkrefs()
   * @generated
   * @ordered
   */
  protected EList<LinkRef> linkrefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotImpl()
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
    return MyDslPackage.Literals.ROBOT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROBOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topology> getTopologies()
  {
    if (topologies == null)
    {
      topologies = new EObjectContainmentEList<Topology>(Topology.class, this, MyDslPackage.ROBOT__TOPOLOGIES);
    }
    return topologies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Link> getLink()
  {
    if (link == null)
    {
      link = new EObjectContainmentEList<Link>(Link.class, this, MyDslPackage.ROBOT__LINK);
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Joint> getJoint()
  {
    if (joint == null)
    {
      joint = new EObjectContainmentEList<Joint>(Joint.class, this, MyDslPackage.ROBOT__JOINT);
    }
    return joint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkRef> getLinkrefs()
  {
    if (linkrefs == null)
    {
      linkrefs = new EObjectContainmentEList<LinkRef>(LinkRef.class, this, MyDslPackage.ROBOT__LINKREFS);
    }
    return linkrefs;
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
      case MyDslPackage.ROBOT__TOPOLOGIES:
        return ((InternalEList<?>)getTopologies()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROBOT__LINK:
        return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROBOT__JOINT:
        return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROBOT__LINKREFS:
        return ((InternalEList<?>)getLinkrefs()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ROBOT__NAME:
        return getName();
      case MyDslPackage.ROBOT__TOPOLOGIES:
        return getTopologies();
      case MyDslPackage.ROBOT__LINK:
        return getLink();
      case MyDslPackage.ROBOT__JOINT:
        return getJoint();
      case MyDslPackage.ROBOT__LINKREFS:
        return getLinkrefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ROBOT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.ROBOT__TOPOLOGIES:
        getTopologies().clear();
        getTopologies().addAll((Collection<? extends Topology>)newValue);
        return;
      case MyDslPackage.ROBOT__LINK:
        getLink().clear();
        getLink().addAll((Collection<? extends Link>)newValue);
        return;
      case MyDslPackage.ROBOT__JOINT:
        getJoint().clear();
        getJoint().addAll((Collection<? extends Joint>)newValue);
        return;
      case MyDslPackage.ROBOT__LINKREFS:
        getLinkrefs().clear();
        getLinkrefs().addAll((Collection<? extends LinkRef>)newValue);
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
      case MyDslPackage.ROBOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.ROBOT__TOPOLOGIES:
        getTopologies().clear();
        return;
      case MyDslPackage.ROBOT__LINK:
        getLink().clear();
        return;
      case MyDslPackage.ROBOT__JOINT:
        getJoint().clear();
        return;
      case MyDslPackage.ROBOT__LINKREFS:
        getLinkrefs().clear();
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
      case MyDslPackage.ROBOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.ROBOT__TOPOLOGIES:
        return topologies != null && !topologies.isEmpty();
      case MyDslPackage.ROBOT__LINK:
        return link != null && !link.isEmpty();
      case MyDslPackage.ROBOT__JOINT:
        return joint != null && !joint.isEmpty();
      case MyDslPackage.ROBOT__LINKREFS:
        return linkrefs != null && !linkrefs.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //RobotImpl
