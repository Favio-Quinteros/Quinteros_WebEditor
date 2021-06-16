/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.UpdateRule#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.UpdateRule#getUpdatingTerm <em>Updating Term</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getUpdateRule()
 * @model
 * @generated
 */
public interface UpdateRule extends Rule
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(BasicTerm)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getUpdateRule_Location()
   * @model containment="true"
   * @generated
   */
  BasicTerm getLocation();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.UpdateRule#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(BasicTerm value);

  /**
   * Returns the value of the '<em><b>Updating Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updating Term</em>' containment reference.
   * @see #setUpdatingTerm(Term)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getUpdateRule_UpdatingTerm()
   * @model containment="true"
   * @generated
   */
  Term getUpdatingTerm();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.UpdateRule#getUpdatingTerm <em>Updating Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updating Term</em>' containment reference.
   * @see #getUpdatingTerm()
   * @generated
   */
  void setUpdatingTerm(Term value);

} // UpdateRule
