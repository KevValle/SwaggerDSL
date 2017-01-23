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

import swaggerDSL.Parameters;
import swaggerDSL.Path;
import swaggerDSL.Response;
import swaggerDSL.Services;
import swaggerDSL.SwaggerDSLPackage;
import swaggerDSL.Tags;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.impl.PathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getOperationID <em>Operation ID</em>}</li>
 *   <li>{@link swaggerDSL.impl.PathImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends MinimalEObjectImpl.Container implements Path {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tags> tags;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> response;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final Services HEADER_EDEFAULT = Services.GET;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Services header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationID() <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationID()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationID() <em>Operation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationID()
	 * @generated
	 * @ordered
	 */
	protected String operationID = OPERATION_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerDSLPackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Services newHeader) {
		Services oldHeader = header;
		header = newHeader == null ? HEADER_EDEFAULT : newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationID() {
		return operationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationID(String newOperationID) {
		String oldOperationID = operationID;
		operationID = newOperationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__OPERATION_ID, oldOperationID, operationID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PATH__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this, SwaggerDSLPackage.PATH__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tags> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tags>(Tags.class, this, SwaggerDSLPackage.PATH__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<Response>(Response.class, this, SwaggerDSLPackage.PATH__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwaggerDSLPackage.PATH__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.PATH__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case SwaggerDSLPackage.PATH__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
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
			case SwaggerDSLPackage.PATH__PATH:
				return getPath();
			case SwaggerDSLPackage.PATH__DESCRIPTION:
				return getDescription();
			case SwaggerDSLPackage.PATH__PARAMETERS:
				return getParameters();
			case SwaggerDSLPackage.PATH__TAGS:
				return getTags();
			case SwaggerDSLPackage.PATH__RESPONSE:
				return getResponse();
			case SwaggerDSLPackage.PATH__HEADER:
				return getHeader();
			case SwaggerDSLPackage.PATH__SUMMARY:
				return getSummary();
			case SwaggerDSLPackage.PATH__OPERATION_ID:
				return getOperationID();
			case SwaggerDSLPackage.PATH__PRODUCES:
				return getProduces();
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
			case SwaggerDSLPackage.PATH__PATH:
				setPath((String)newValue);
				return;
			case SwaggerDSLPackage.PATH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SwaggerDSLPackage.PATH__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameters>)newValue);
				return;
			case SwaggerDSLPackage.PATH__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tags>)newValue);
				return;
			case SwaggerDSLPackage.PATH__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Response>)newValue);
				return;
			case SwaggerDSLPackage.PATH__HEADER:
				setHeader((Services)newValue);
				return;
			case SwaggerDSLPackage.PATH__SUMMARY:
				setSummary((String)newValue);
				return;
			case SwaggerDSLPackage.PATH__OPERATION_ID:
				setOperationID((String)newValue);
				return;
			case SwaggerDSLPackage.PATH__PRODUCES:
				setProduces((String)newValue);
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
			case SwaggerDSLPackage.PATH__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SwaggerDSLPackage.PATH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SwaggerDSLPackage.PATH__PARAMETERS:
				getParameters().clear();
				return;
			case SwaggerDSLPackage.PATH__TAGS:
				getTags().clear();
				return;
			case SwaggerDSLPackage.PATH__RESPONSE:
				getResponse().clear();
				return;
			case SwaggerDSLPackage.PATH__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case SwaggerDSLPackage.PATH__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case SwaggerDSLPackage.PATH__OPERATION_ID:
				setOperationID(OPERATION_ID_EDEFAULT);
				return;
			case SwaggerDSLPackage.PATH__PRODUCES:
				setProduces(PRODUCES_EDEFAULT);
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
			case SwaggerDSLPackage.PATH__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SwaggerDSLPackage.PATH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SwaggerDSLPackage.PATH__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SwaggerDSLPackage.PATH__TAGS:
				return tags != null && !tags.isEmpty();
			case SwaggerDSLPackage.PATH__RESPONSE:
				return response != null && !response.isEmpty();
			case SwaggerDSLPackage.PATH__HEADER:
				return header != HEADER_EDEFAULT;
			case SwaggerDSLPackage.PATH__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case SwaggerDSLPackage.PATH__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationID != null : !OPERATION_ID_EDEFAULT.equals(operationID);
			case SwaggerDSLPackage.PATH__PRODUCES:
				return PRODUCES_EDEFAULT == null ? produces != null : !PRODUCES_EDEFAULT.equals(produces);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", description: ");
		result.append(description);
		result.append(", header: ");
		result.append(header);
		result.append(", summary: ");
		result.append(summary);
		result.append(", operationID: ");
		result.append(operationID);
		result.append(", produces: ");
		result.append(produces);
		result.append(')');
		return result.toString();
	}

} //PathImpl
