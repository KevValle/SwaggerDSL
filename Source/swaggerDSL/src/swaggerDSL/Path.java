/**
 */
package swaggerDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.Path#getPath <em>Path</em>}</li>
 *   <li>{@link swaggerDSL.Path#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.Path#getParameters <em>Parameters</em>}</li>
 *   <li>{@link swaggerDSL.Path#getTags <em>Tags</em>}</li>
 *   <li>{@link swaggerDSL.Path#getResponse <em>Response</em>}</li>
 *   <li>{@link swaggerDSL.Path#getHeader <em>Header</em>}</li>
 *   <li>{@link swaggerDSL.Path#getSummary <em>Summary</em>}</li>
 *   <li>{@link swaggerDSL.Path#getOperationID <em>Operation ID</em>}</li>
 *   <li>{@link swaggerDSL.Path#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see swaggerDSL.SwaggerDSLPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link swaggerDSL.Services}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see swaggerDSL.Services
	 * @see #setHeader(Services)
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Header()
	 * @model default="GET"
	 * @generated
	 */
	Services getHeader();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see swaggerDSL.Services
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Services value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation ID</em>' attribute.
	 * @see #setOperationID(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_OperationID()
	 * @model
	 * @generated
	 */
	String getOperationID();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getOperationID <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation ID</em>' attribute.
	 * @see #getOperationID()
	 * @generated
	 */
	void setOperationID(String value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute.
	 * @see #setProduces(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Produces()
	 * @model
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getProduces <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' attribute.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(String value);

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
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link swaggerDSL.Path#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Tags}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tags> getTags();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getPath_Response()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Response> getResponse();

} // Path
