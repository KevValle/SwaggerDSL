/**
 */
package swaggerDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.Response#getName <em>Name</em>}</li>
 *   <li>{@link swaggerDSL.Response#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.Response#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link swaggerDSL.Response#getSchemaRef <em>Schema Ref</em>}</li>
 * </ul>
 *
 * @see swaggerDSL.SwaggerDSLPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
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
	 * @see swaggerDSL.SwaggerDSLPackage#getResponse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link swaggerDSL.Response#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see swaggerDSL.SwaggerDSLPackage#getResponse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link swaggerDSL.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Schema Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Type</em>' attribute.
	 * @see #setSchemaType(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getResponse_SchemaType()
	 * @model
	 * @generated
	 */
	String getSchemaType();

	/**
	 * Sets the value of the '{@link swaggerDSL.Response#getSchemaType <em>Schema Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Type</em>' attribute.
	 * @see #getSchemaType()
	 * @generated
	 */
	void setSchemaType(String value);

	/**
	 * Returns the value of the '<em><b>Schema Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Ref</em>' attribute.
	 * @see #setSchemaRef(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getResponse_SchemaRef()
	 * @model
	 * @generated
	 */
	String getSchemaRef();

	/**
	 * Sets the value of the '{@link swaggerDSL.Response#getSchemaRef <em>Schema Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Ref</em>' attribute.
	 * @see #getSchemaRef()
	 * @generated
	 */
	void setSchemaRef(String value);

} // Response
