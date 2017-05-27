/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Inertia;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIxx <em>Ixx</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIxy <em>Ixy</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIxz <em>Ixz</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIyy <em>Iyy</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIyz <em>Iyz</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InertiaImpl#getIzz <em>Izz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertiaImpl extends MinimalEObjectImpl.Container implements Inertia
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
   * The default value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxx()
   * @generated
   * @ordered
   */
  protected static final int IXX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxx()
   * @generated
   * @ordered
   */
  protected int ixx = IXX_EDEFAULT;

  /**
   * The default value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxy()
   * @generated
   * @ordered
   */
  protected static final int IXY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxy()
   * @generated
   * @ordered
   */
  protected int ixy = IXY_EDEFAULT;

  /**
   * The default value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxz()
   * @generated
   * @ordered
   */
  protected static final int IXZ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxz()
   * @generated
   * @ordered
   */
  protected int ixz = IXZ_EDEFAULT;

  /**
   * The default value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyy()
   * @generated
   * @ordered
   */
  protected static final int IYY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyy()
   * @generated
   * @ordered
   */
  protected int iyy = IYY_EDEFAULT;

  /**
   * The default value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyz()
   * @generated
   * @ordered
   */
  protected static final int IYZ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIyz()
   * @generated
   * @ordered
   */
  protected int iyz = IYZ_EDEFAULT;

  /**
   * The default value of the '{@link #getIzz() <em>Izz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzz()
   * @generated
   * @ordered
   */
  protected static final int IZZ_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIzz() <em>Izz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzz()
   * @generated
   * @ordered
   */
  protected int izz = IZZ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InertiaImpl()
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
    return MyDslPackage.Literals.INERTIA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIxx()
  {
    return ixx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIxx(int newIxx)
  {
    int oldIxx = ixx;
    ixx = newIxx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IXX, oldIxx, ixx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIxy()
  {
    return ixy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIxy(int newIxy)
  {
    int oldIxy = ixy;
    ixy = newIxy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IXY, oldIxy, ixy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIxz()
  {
    return ixz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIxz(int newIxz)
  {
    int oldIxz = ixz;
    ixz = newIxz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IXZ, oldIxz, ixz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIyy()
  {
    return iyy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIyy(int newIyy)
  {
    int oldIyy = iyy;
    iyy = newIyy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IYY, oldIyy, iyy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIyz()
  {
    return iyz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIyz(int newIyz)
  {
    int oldIyz = iyz;
    iyz = newIyz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IYZ, oldIyz, iyz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIzz()
  {
    return izz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIzz(int newIzz)
  {
    int oldIzz = izz;
    izz = newIzz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INERTIA__IZZ, oldIzz, izz));
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
      case MyDslPackage.INERTIA__NAME:
        return getName();
      case MyDslPackage.INERTIA__IXX:
        return getIxx();
      case MyDslPackage.INERTIA__IXY:
        return getIxy();
      case MyDslPackage.INERTIA__IXZ:
        return getIxz();
      case MyDslPackage.INERTIA__IYY:
        return getIyy();
      case MyDslPackage.INERTIA__IYZ:
        return getIyz();
      case MyDslPackage.INERTIA__IZZ:
        return getIzz();
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
      case MyDslPackage.INERTIA__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.INERTIA__IXX:
        setIxx((Integer)newValue);
        return;
      case MyDslPackage.INERTIA__IXY:
        setIxy((Integer)newValue);
        return;
      case MyDslPackage.INERTIA__IXZ:
        setIxz((Integer)newValue);
        return;
      case MyDslPackage.INERTIA__IYY:
        setIyy((Integer)newValue);
        return;
      case MyDslPackage.INERTIA__IYZ:
        setIyz((Integer)newValue);
        return;
      case MyDslPackage.INERTIA__IZZ:
        setIzz((Integer)newValue);
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
      case MyDslPackage.INERTIA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IXX:
        setIxx(IXX_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IXY:
        setIxy(IXY_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IXZ:
        setIxz(IXZ_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IYY:
        setIyy(IYY_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IYZ:
        setIyz(IYZ_EDEFAULT);
        return;
      case MyDslPackage.INERTIA__IZZ:
        setIzz(IZZ_EDEFAULT);
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
      case MyDslPackage.INERTIA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.INERTIA__IXX:
        return ixx != IXX_EDEFAULT;
      case MyDslPackage.INERTIA__IXY:
        return ixy != IXY_EDEFAULT;
      case MyDslPackage.INERTIA__IXZ:
        return ixz != IXZ_EDEFAULT;
      case MyDslPackage.INERTIA__IYY:
        return iyy != IYY_EDEFAULT;
      case MyDslPackage.INERTIA__IYZ:
        return iyz != IYZ_EDEFAULT;
      case MyDslPackage.INERTIA__IZZ:
        return izz != IZZ_EDEFAULT;
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
    result.append(", ixx: ");
    result.append(ixx);
    result.append(", ixy: ");
    result.append(ixy);
    result.append(", ixz: ");
    result.append(ixz);
    result.append(", iyy: ");
    result.append(iyy);
    result.append(", iyz: ");
    result.append(iyz);
    result.append(", izz: ");
    result.append(izz);
    result.append(')');
    return result.toString();
  }

} //InertiaImpl
