/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.asmetal.asmetaL.AsmetaLPackage;
import org.xtext.asmetal.asmetaL.ComprehensionTerm;
import org.xtext.asmetal.asmetaL.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comprehension Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.ComprehensionTermImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.ComprehensionTermImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.impl.ComprehensionTermImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComprehensionTermImpl extends VariableBindingTermImpl implements ComprehensionTerm
{
  /**
   * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanges()
   * @generated
   * @ordered
   */
  protected EList<Term> ranges;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Term guard;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Term term;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComprehensionTermImpl()
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
    return AsmetaLPackage.Literals.COMPREHENSION_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Term> getRanges()
  {
    if (ranges == null)
    {
      ranges = new EObjectContainmentEList<Term>(Term.class, this, AsmetaLPackage.COMPREHENSION_TERM__RANGES);
    }
    return ranges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Term getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(Term newGuard, NotificationChain msgs)
  {
    Term oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetaLPackage.COMPREHENSION_TERM__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGuard(Term newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetaLPackage.COMPREHENSION_TERM__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetaLPackage.COMPREHENSION_TERM__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetaLPackage.COMPREHENSION_TERM__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Term getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs)
  {
    Term oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsmetaLPackage.COMPREHENSION_TERM__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTerm(Term newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsmetaLPackage.COMPREHENSION_TERM__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsmetaLPackage.COMPREHENSION_TERM__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsmetaLPackage.COMPREHENSION_TERM__TERM, newTerm, newTerm));
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
      case AsmetaLPackage.COMPREHENSION_TERM__RANGES:
        return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
      case AsmetaLPackage.COMPREHENSION_TERM__GUARD:
        return basicSetGuard(null, msgs);
      case AsmetaLPackage.COMPREHENSION_TERM__TERM:
        return basicSetTerm(null, msgs);
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
      case AsmetaLPackage.COMPREHENSION_TERM__RANGES:
        return getRanges();
      case AsmetaLPackage.COMPREHENSION_TERM__GUARD:
        return getGuard();
      case AsmetaLPackage.COMPREHENSION_TERM__TERM:
        return getTerm();
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
      case AsmetaLPackage.COMPREHENSION_TERM__RANGES:
        getRanges().clear();
        getRanges().addAll((Collection<? extends Term>)newValue);
        return;
      case AsmetaLPackage.COMPREHENSION_TERM__GUARD:
        setGuard((Term)newValue);
        return;
      case AsmetaLPackage.COMPREHENSION_TERM__TERM:
        setTerm((Term)newValue);
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
      case AsmetaLPackage.COMPREHENSION_TERM__RANGES:
        getRanges().clear();
        return;
      case AsmetaLPackage.COMPREHENSION_TERM__GUARD:
        setGuard((Term)null);
        return;
      case AsmetaLPackage.COMPREHENSION_TERM__TERM:
        setTerm((Term)null);
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
      case AsmetaLPackage.COMPREHENSION_TERM__RANGES:
        return ranges != null && !ranges.isEmpty();
      case AsmetaLPackage.COMPREHENSION_TERM__GUARD:
        return guard != null;
      case AsmetaLPackage.COMPREHENSION_TERM__TERM:
        return term != null;
    }
    return super.eIsSet(featureID);
  }

} //ComprehensionTermImpl