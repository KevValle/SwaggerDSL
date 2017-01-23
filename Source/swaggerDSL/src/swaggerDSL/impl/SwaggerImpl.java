/**
 */
package swaggerDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swaggerDSL.Definition;
import swaggerDSL.Parameters;
import swaggerDSL.Path;
import swaggerDSL.Properties;
import swaggerDSL.Response;
import swaggerDSL.Swagger;
import swaggerDSL.SwaggerDSLPackage;
import swaggerDSL.Tags;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swagger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getInfoTitle <em>Info Title</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getInfoDescription <em>Info Description</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getInfoVersion <em>Info Version</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getAux_properties <em>Aux properties</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getAux_response <em>Aux response</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getAux_parameters <em>Aux parameters</em>}</li>
 *   <li>{@link swaggerDSL.impl.SwaggerImpl#getAux_tags <em>Aux tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwaggerImpl extends MinimalEObjectImpl.Container implements Swagger {
	/**
	 * The default value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected static final float SWAGGER_EDEFAULT = 2.0F;

	/**
	 * The cached value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected float swagger = SWAGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemes() <em>Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected String schemes = SCHEMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected String produces = PRODUCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoTitle() <em>Info Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoTitle() <em>Info Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTitle()
	 * @generated
	 * @ordered
	 */
	protected String infoTitle = INFO_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoDescription() <em>Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoDescription() <em>Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected String infoDescription = INFO_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoVersion() <em>Info Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoVersion() <em>Info Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoVersion()
	 * @generated
	 * @ordered
	 */
	protected String infoVersion = INFO_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> path;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definition;

	/**
	 * The default value of the '{@link #getConsumes() <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected String consumes = CONSUMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAux_properties() <em>Aux properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_properties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> aux_properties;

	/**
	 * The cached value of the '{@link #getAux_response() <em>Aux response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_response()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> aux_response;

	/**
	 * The cached value of the '{@link #getAux_parameters() <em>Aux parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_parameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> aux_parameters;

	/**
	 * The cached value of the '{@link #getAux_tags() <em>Aux tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_tags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tags> aux_tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwaggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerDSLPackage.Literals.SWAGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSwagger() {
		return swagger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwagger(float newSwagger) {
		float oldSwagger = swagger;
		swagger = newSwagger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__SWAGGER, oldSwagger, swagger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemes() {
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemes(String newSchemes) {
		String oldSchemes = schemes;
		schemes = newSchemes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__SCHEMES, oldSchemes, schemes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProduces() {
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduces(String newProduces) {
		String oldProduces = produces;
		produces = newProduces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoTitle() {
		return infoTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoTitle(String newInfoTitle) {
		String oldInfoTitle = infoTitle;
		infoTitle = newInfoTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__INFO_TITLE, oldInfoTitle, infoTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoDescription() {
		return infoDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoDescription(String newInfoDescription) {
		String oldInfoDescription = infoDescription;
		infoDescription = newInfoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION, oldInfoDescription, infoDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoVersion() {
		return infoVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoVersion(String newInfoVersion) {
		String oldInfoVersion = infoVersion;
		infoVersion = newInfoVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__INFO_VERSION, oldInfoVersion, infoVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<Path>(Path.class, this, SwaggerDSLPackage.SWAGGER__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Definition>(Definition.class, this, SwaggerDSLPackage.SWAGGER__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumes() {
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumes(String newConsumes) {
		String oldConsumes = consumes;
		consumes = newConsumes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.SWAGGER__CONSUMES, oldConsumes, consumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getAux_properties() {
		if (aux_properties == null) {
			aux_properties = new EObjectContainmentEList<Properties>(Properties.class, this, SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES);
		}
		return aux_properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getAux_response() {
		if (aux_response == null) {
			aux_response = new EObjectContainmentEList<Response>(Response.class, this, SwaggerDSLPackage.SWAGGER__AUX_RESPONSE);
		}
		return aux_response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameters> getAux_parameters() {
		if (aux_parameters == null) {
			aux_parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this, SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS);
		}
		return aux_parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tags> getAux_tags() {
		if (aux_tags == null) {
			aux_tags = new EObjectContainmentEList<Tags>(Tags.class, this, SwaggerDSLPackage.SWAGGER__AUX_TAGS);
		}
		return aux_tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwaggerDSLPackage.SWAGGER__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
				return ((InternalEList<?>)getAux_properties()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
				return ((InternalEList<?>)getAux_response()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
				return ((InternalEList<?>)getAux_parameters()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				return ((InternalEList<?>)getAux_tags()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwaggerDSLPackage.SWAGGER__SWAGGER:
				return getSwagger();
			case SwaggerDSLPackage.SWAGGER__HOST:
				return getHost();
			case SwaggerDSLPackage.SWAGGER__SCHEMES:
				return getSchemes();
			case SwaggerDSLPackage.SWAGGER__BASE_PATH:
				return getBasePath();
			case SwaggerDSLPackage.SWAGGER__PRODUCES:
				return getProduces();
			case SwaggerDSLPackage.SWAGGER__INFO_TITLE:
				return getInfoTitle();
			case SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION:
				return getInfoDescription();
			case SwaggerDSLPackage.SWAGGER__INFO_VERSION:
				return getInfoVersion();
			case SwaggerDSLPackage.SWAGGER__PATH:
				return getPath();
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
				return getDefinition();
			case SwaggerDSLPackage.SWAGGER__CONSUMES:
				return getConsumes();
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
				return getAux_properties();
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
				return getAux_response();
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
				return getAux_parameters();
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				return getAux_tags();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwaggerDSLPackage.SWAGGER__SWAGGER:
				setSwagger((Float)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__HOST:
				setHost((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__SCHEMES:
				setSchemes((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__PRODUCES:
				setProduces((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_TITLE:
				setInfoTitle((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION:
				setInfoDescription((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_VERSION:
				setInfoVersion((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends Path>)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Definition>)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__CONSUMES:
				setConsumes((String)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
				getAux_properties().clear();
				getAux_properties().addAll((Collection<? extends Properties>)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
				getAux_response().clear();
				getAux_response().addAll((Collection<? extends Response>)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
				getAux_parameters().clear();
				getAux_parameters().addAll((Collection<? extends Parameters>)newValue);
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				getAux_tags().clear();
				getAux_tags().addAll((Collection<? extends Tags>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SwaggerDSLPackage.SWAGGER__SWAGGER:
				setSwagger(SWAGGER_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__SCHEMES:
				setSchemes(SCHEMES_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_TITLE:
				setInfoTitle(INFO_TITLE_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION:
				setInfoDescription(INFO_DESCRIPTION_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__INFO_VERSION:
				setInfoVersion(INFO_VERSION_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__PATH:
				getPath().clear();
				return;
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
				getDefinition().clear();
				return;
			case SwaggerDSLPackage.SWAGGER__CONSUMES:
				setConsumes(CONSUMES_EDEFAULT);
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
				getAux_properties().clear();
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
				getAux_response().clear();
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
				getAux_parameters().clear();
				return;
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				getAux_tags().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SwaggerDSLPackage.SWAGGER__SWAGGER:
				return swagger != SWAGGER_EDEFAULT;
			case SwaggerDSLPackage.SWAGGER__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case SwaggerDSLPackage.SWAGGER__SCHEMES:
				return SCHEMES_EDEFAULT == null ? schemes != null : !SCHEMES_EDEFAULT.equals(schemes);
			case SwaggerDSLPackage.SWAGGER__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case SwaggerDSLPackage.SWAGGER__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
			case SwaggerDSLPackage.SWAGGER__INFO_TITLE:
				return INFO_TITLE_EDEFAULT == null ? infoTitle != null : !INFO_TITLE_EDEFAULT.equals(infoTitle);
			case SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION:
				return INFO_DESCRIPTION_EDEFAULT == null ? infoDescription != null : !INFO_DESCRIPTION_EDEFAULT.equals(infoDescription);
			case SwaggerDSLPackage.SWAGGER__INFO_VERSION:
				return INFO_VERSION_EDEFAULT == null ? infoVersion != null : !INFO_VERSION_EDEFAULT.equals(infoVersion);
			case SwaggerDSLPackage.SWAGGER__PATH:
				return path != null && !path.isEmpty();
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
				return definition != null && !definition.isEmpty();
			case SwaggerDSLPackage.SWAGGER__CONSUMES:
				return CONSUMES_EDEFAULT == null ? consumes != null : !CONSUMES_EDEFAULT.equals(consumes);
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
				return aux_properties != null && !aux_properties.isEmpty();
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
				return aux_response != null && !aux_response.isEmpty();
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
				return aux_parameters != null && !aux_parameters.isEmpty();
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				return aux_tags != null && !aux_tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (swagger: ");
		result.append(swagger);
		result.append(", host: ");
		result.append(host);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", produces: ");
		result.append(produces);
		result.append(", infoTitle: ");
		result.append(infoTitle);
		result.append(", infoDescription: ");
		result.append(infoDescription);
		result.append(", infoVersion: ");
		result.append(infoVersion);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(')');
		return result.toString();
	}

} //SwaggerImpl
