/**
 */
package swaggerDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see swaggerDSL.SwaggerDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SwaggerDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swaggerDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/swaggerDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "swaggerDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwaggerDSLPackage eINSTANCE = swaggerDSL.impl.SwaggerDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.SwaggerImpl <em>Swagger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.SwaggerImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getSwagger()
	 * @generated
	 */
	int SWAGGER = 0;

	/**
	 * The feature id for the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__SWAGGER = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__HOST = 1;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__SCHEMES = 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__BASE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__PRODUCES = 4;

	/**
	 * The feature id for the '<em><b>Info Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__INFO_TITLE = 5;

	/**
	 * The feature id for the '<em><b>Info Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__INFO_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Info Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__INFO_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__PATH = 8;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__CONSUMES = 10;

	/**
	 * The feature id for the '<em><b>Aux properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__AUX_PROPERTIES = 11;

	/**
	 * The feature id for the '<em><b>Aux response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__AUX_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Aux parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__AUX_PARAMETERS = 13;

	/**
	 * The feature id for the '<em><b>Aux tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER__AUX_TAGS = 14;

	/**
	 * The number of structural features of the '<em>Swagger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Swagger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.PathImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TAGS = 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HEADER = 5;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SUMMARY = 6;

	/**
	 * The feature id for the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__OPERATION_ID = 7;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PRODUCES = 8;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.ParametersImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__IN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.TagsImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__TAG = 0;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.ResponseImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Schema Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SCHEMA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Schema Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SCHEMA_REF = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.DefinitionImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link swaggerDSL.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.impl.PropertiesImpl
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link swaggerDSL.Services <em>Services</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see swaggerDSL.Services
	 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 7;


	/**
	 * Returns the meta object for class '{@link swaggerDSL.Swagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swagger</em>'.
	 * @see swaggerDSL.Swagger
	 * @generated
	 */
	EClass getSwagger();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getSwagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swagger</em>'.
	 * @see swaggerDSL.Swagger#getSwagger()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Swagger();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see swaggerDSL.Swagger#getHost()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Host();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schemes</em>'.
	 * @see swaggerDSL.Swagger#getSchemes()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Schemes();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see swaggerDSL.Swagger#getBasePath()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_BasePath();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produces</em>'.
	 * @see swaggerDSL.Swagger#getProduces()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Produces();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getInfoTitle <em>Info Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Title</em>'.
	 * @see swaggerDSL.Swagger#getInfoTitle()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_InfoTitle();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getInfoDescription <em>Info Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Description</em>'.
	 * @see swaggerDSL.Swagger#getInfoDescription()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_InfoDescription();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getInfoVersion <em>Info Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Version</em>'.
	 * @see swaggerDSL.Swagger#getInfoVersion()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_InfoVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see swaggerDSL.Swagger#getPath()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see swaggerDSL.Swagger#getDefinition()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Definition();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Swagger#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumes</em>'.
	 * @see swaggerDSL.Swagger#getConsumes()
	 * @see #getSwagger()
	 * @generated
	 */
	EAttribute getSwagger_Consumes();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getAux_properties <em>Aux properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aux properties</em>'.
	 * @see swaggerDSL.Swagger#getAux_properties()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Aux_properties();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getAux_response <em>Aux response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aux response</em>'.
	 * @see swaggerDSL.Swagger#getAux_response()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Aux_response();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getAux_parameters <em>Aux parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aux parameters</em>'.
	 * @see swaggerDSL.Swagger#getAux_parameters()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Aux_parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Swagger#getAux_tags <em>Aux tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aux tags</em>'.
	 * @see swaggerDSL.Swagger#getAux_tags()
	 * @see #getSwagger()
	 * @generated
	 */
	EReference getSwagger_Aux_tags();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see swaggerDSL.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see swaggerDSL.Path#getPath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Path();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see swaggerDSL.Path#getHeader()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Header();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see swaggerDSL.Path#getSummary()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Summary();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getOperationID <em>Operation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation ID</em>'.
	 * @see swaggerDSL.Path#getOperationID()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_OperationID();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produces</em>'.
	 * @see swaggerDSL.Path#getProduces()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Produces();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Path#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see swaggerDSL.Path#getDescription()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Path#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see swaggerDSL.Path#getParameters()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Path#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see swaggerDSL.Path#getTags()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Path#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see swaggerDSL.Path#getResponse()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Response();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see swaggerDSL.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swaggerDSL.Parameters#getName()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Name();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see swaggerDSL.Parameters#getIn()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_In();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see swaggerDSL.Parameters#getDescription()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Description();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see swaggerDSL.Parameters#isRequired()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Required();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see swaggerDSL.Parameters#getFormat()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Format();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Parameters#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see swaggerDSL.Parameters#getType()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Type();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see swaggerDSL.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Tags#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see swaggerDSL.Tags#getTag()
	 * @see #getTags()
	 * @generated
	 */
	EAttribute getTags_Tag();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see swaggerDSL.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Response#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swaggerDSL.Response#getName()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Name();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see swaggerDSL.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Response#getSchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Type</em>'.
	 * @see swaggerDSL.Response#getSchemaType()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_SchemaType();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Response#getSchemaRef <em>Schema Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Ref</em>'.
	 * @see swaggerDSL.Response#getSchemaRef()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_SchemaRef();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see swaggerDSL.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Definition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see swaggerDSL.Definition#getName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Definition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see swaggerDSL.Definition#getType()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link swaggerDSL.Definition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see swaggerDSL.Definition#getProperties()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Properties();

	/**
	 * Returns the meta object for class '{@link swaggerDSL.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see swaggerDSL.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Properties#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see swaggerDSL.Properties#getPropertyName()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Properties#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see swaggerDSL.Properties#getType()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Type();

	/**
	 * Returns the meta object for the attribute '{@link swaggerDSL.Properties#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see swaggerDSL.Properties#getDescription()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Description();

	/**
	 * Returns the meta object for enum '{@link swaggerDSL.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Services</em>'.
	 * @see swaggerDSL.Services
	 * @generated
	 */
	EEnum getServices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwaggerDSLFactory getSwaggerDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.SwaggerImpl <em>Swagger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.SwaggerImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getSwagger()
		 * @generated
		 */
		EClass SWAGGER = eINSTANCE.getSwagger();

		/**
		 * The meta object literal for the '<em><b>Swagger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__SWAGGER = eINSTANCE.getSwagger_Swagger();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__HOST = eINSTANCE.getSwagger_Host();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__SCHEMES = eINSTANCE.getSwagger_Schemes();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__BASE_PATH = eINSTANCE.getSwagger_BasePath();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__PRODUCES = eINSTANCE.getSwagger_Produces();

		/**
		 * The meta object literal for the '<em><b>Info Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__INFO_TITLE = eINSTANCE.getSwagger_InfoTitle();

		/**
		 * The meta object literal for the '<em><b>Info Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__INFO_DESCRIPTION = eINSTANCE.getSwagger_InfoDescription();

		/**
		 * The meta object literal for the '<em><b>Info Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__INFO_VERSION = eINSTANCE.getSwagger_InfoVersion();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__PATH = eINSTANCE.getSwagger_Path();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__DEFINITION = eINSTANCE.getSwagger_Definition();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER__CONSUMES = eINSTANCE.getSwagger_Consumes();

		/**
		 * The meta object literal for the '<em><b>Aux properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__AUX_PROPERTIES = eINSTANCE.getSwagger_Aux_properties();

		/**
		 * The meta object literal for the '<em><b>Aux response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__AUX_RESPONSE = eINSTANCE.getSwagger_Aux_response();

		/**
		 * The meta object literal for the '<em><b>Aux parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__AUX_PARAMETERS = eINSTANCE.getSwagger_Aux_parameters();

		/**
		 * The meta object literal for the '<em><b>Aux tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER__AUX_TAGS = eINSTANCE.getSwagger_Aux_tags();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.PathImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__PATH = eINSTANCE.getPath_Path();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__HEADER = eINSTANCE.getPath_Header();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__SUMMARY = eINSTANCE.getPath_Summary();

		/**
		 * The meta object literal for the '<em><b>Operation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__OPERATION_ID = eINSTANCE.getPath_OperationID();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__PRODUCES = eINSTANCE.getPath_Produces();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__DESCRIPTION = eINSTANCE.getPath_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PARAMETERS = eINSTANCE.getPath_Parameters();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__TAGS = eINSTANCE.getPath_Tags();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__RESPONSE = eINSTANCE.getPath_Response();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.ParametersImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NAME = eINSTANCE.getParameters_Name();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__IN = eINSTANCE.getParameters_In();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__DESCRIPTION = eINSTANCE.getParameters_Description();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__REQUIRED = eINSTANCE.getParameters_Required();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__FORMAT = eINSTANCE.getParameters_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TYPE = eINSTANCE.getParameters_Type();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.TagsImpl <em>Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.TagsImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getTags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.getTags();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS__TAG = eINSTANCE.getTags_Tag();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.ResponseImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__NAME = eINSTANCE.getResponse_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Schema Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__SCHEMA_TYPE = eINSTANCE.getResponse_SchemaType();

		/**
		 * The meta object literal for the '<em><b>Schema Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__SCHEMA_REF = eINSTANCE.getResponse_SchemaRef();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.DefinitionImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__TYPE = eINSTANCE.getDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__PROPERTIES = eINSTANCE.getDefinition_Properties();

		/**
		 * The meta object literal for the '{@link swaggerDSL.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.impl.PropertiesImpl
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PROPERTY_NAME = eINSTANCE.getProperties_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__TYPE = eINSTANCE.getProperties_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__DESCRIPTION = eINSTANCE.getProperties_Description();

		/**
		 * The meta object literal for the '{@link swaggerDSL.Services <em>Services</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see swaggerDSL.Services
		 * @see swaggerDSL.impl.SwaggerDSLPackageImpl#getServices()
		 * @generated
		 */
		EEnum SERVICES = eINSTANCE.getServices();

	}

} //SwaggerDSLPackage
