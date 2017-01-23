/**
 */
package swaggerDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swagger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.Swagger#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getHost <em>Host</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getProduces <em>Produces</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getInfoTitle <em>Info Title</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getInfoDescription <em>Info Description</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getInfoVersion <em>Info Version</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getPath <em>Path</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getDefinition <em>Definition</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getAux_properties <em>Aux properties</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getAux_response <em>Aux response</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getAux_parameters <em>Aux parameters</em>}</li>
 *   <li>{@link swaggerDSL.Swagger#getAux_tags <em>Aux tags</em>}</li>
 * </ul>
 *
 * @see swaggerDSL.SwaggerDSLPackage#getSwagger()
 * @model
 * @generated
 */
public interface Swagger extends EObject {
	/**
	 * Returns the value of the '<em><b>Swagger</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swagger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swagger</em>' attribute.
	 * @see #setSwagger(float)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Swagger()
	 * @model default="2.0"
	 * @generated
	 */
	float getSwagger();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getSwagger <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger</em>' attribute.
	 * @see #getSwagger()
	 * @generated
	 */
	void setSwagger(float value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute.
	 * @see #setSchemes(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Schemes()
	 * @model
	 * @generated
	 */
	String getSchemes();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getSchemes <em>Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemes</em>' attribute.
	 * @see #getSchemes()
	 * @generated
	 */
	void setSchemes(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

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
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Produces()
	 * @model
	 * @generated
	 */
	String getProduces();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getProduces <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' attribute.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(String value);

	/**
	 * Returns the value of the '<em><b>Info Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Title</em>' attribute.
	 * @see #setInfoTitle(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_InfoTitle()
	 * @model
	 * @generated
	 */
	String getInfoTitle();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getInfoTitle <em>Info Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Title</em>' attribute.
	 * @see #getInfoTitle()
	 * @generated
	 */
	void setInfoTitle(String value);

	/**
	 * Returns the value of the '<em><b>Info Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Description</em>' attribute.
	 * @see #setInfoDescription(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_InfoDescription()
	 * @model
	 * @generated
	 */
	String getInfoDescription();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getInfoDescription <em>Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Description</em>' attribute.
	 * @see #getInfoDescription()
	 * @generated
	 */
	void setInfoDescription(String value);

	/**
	 * Returns the value of the '<em><b>Info Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Version</em>' attribute.
	 * @see #setInfoVersion(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_InfoVersion()
	 * @model
	 * @generated
	 */
	String getInfoVersion();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getInfoVersion <em>Info Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Version</em>' attribute.
	 * @see #getInfoVersion()
	 * @generated
	 */
	void setInfoVersion(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Path}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Path> getPath();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Definition> getDefinition();

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute.
	 * @see #setConsumes(String)
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Consumes()
	 * @model
	 * @generated
	 */
	String getConsumes();

	/**
	 * Sets the value of the '{@link swaggerDSL.Swagger#getConsumes <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumes</em>' attribute.
	 * @see #getConsumes()
	 * @generated
	 */
	void setConsumes(String value);

	/**
	 * Returns the value of the '<em><b>Aux properties</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux properties</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Aux_properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getAux_properties();

	/**
	 * Returns the value of the '<em><b>Aux response</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux response</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Aux_response()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getAux_response();

	/**
	 * Returns the value of the '<em><b>Aux parameters</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux parameters</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Aux_parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getAux_parameters();

	/**
	 * Returns the value of the '<em><b>Aux tags</b></em>' containment reference list.
	 * The list contents are of type {@link swaggerDSL.Tags}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux tags</em>' containment reference list.
	 * @see swaggerDSL.SwaggerDSLPackage#getSwagger_Aux_tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tags> getAux_tags();

} // Swagger
