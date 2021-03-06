/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.asmetaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getReturnedDomain <em>Returned Domain</em>}</li>
 *   <li>{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration()
 * @model
 * @generated
 */
public interface RuleDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asmetal.asmetaL.Domain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference list.
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration_Domain()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomain();

  /**
   * Returns the value of the '<em><b>Returned Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returned Domain</em>' containment reference.
   * @see #setReturnedDomain(Domain)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration_ReturnedDomain()
   * @model containment="true"
   * @generated
   */
  Domain getReturnedDomain();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getReturnedDomain <em>Returned Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returned Domain</em>' containment reference.
   * @see #getReturnedDomain()
   * @generated
   */
  void setReturnedDomain(Domain value);

  /**
   * Returns the value of the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Body</em>' containment reference.
   * @see #setRuleBody(Rule)
   * @see org.xtext.asmetal.asmetaL.AsmetaLPackage#getRuleDeclaration_RuleBody()
   * @model containment="true"
   * @generated
   */
  Rule getRuleBody();

  /**
   * Sets the value of the '{@link org.xtext.asmetal.asmetaL.RuleDeclaration#getRuleBody <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Body</em>' containment reference.
   * @see #getRuleBody()
   * @generated
   */
  void setRuleBody(Rule value);

} // RuleDeclaration
