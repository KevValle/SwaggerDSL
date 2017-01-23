/**
 */
package swaggerDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.Definition#getName <em>Name</em>}</li>
 *   <li>{@link swaggerDSL.Definition#getType <em>Type</em>}</li>
 *   <li>{@link swaggerDSL.Definition#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see swaggerDSL.SwaggerDSLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject {
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
	 * @see swaggerDSL.SwaggerDSLPackage#getDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link swaggerDSL.Definition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see swaggerDSL.SwaggerDSLPackage#getDefinition_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link swaggerDSL.Definition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getProperties();

} // Definition
