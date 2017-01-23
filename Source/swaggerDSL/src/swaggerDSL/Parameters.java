/**
 */
package swaggerDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.Parameters#getName <em>Name</em>}</li>
 *   <li>{@link swaggerDSL.Parameters#getIn <em>In</em>}</li>
 *   <li>{@link swaggerDSL.Parameters#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.Parameters#isRequired <em>Required</em>}</li>
 *   <li>{@link swaggerDSL.Parameters#getFormat <em>Format</em>}</li>
 *   <li>{@link swaggerDSL.Parameters#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see swaggerDSL.SwaggerDSLPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

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
	 * @see swaggerDSL.SwaggerDSLPackage#getParameters_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link swaggerDSL.Parameters#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Parameters
