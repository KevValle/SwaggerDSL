/**
 */
package swaggerDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import swaggerDSL.Response;
import swaggerDSL.SwaggerDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.impl.ResponseImpl#getName <em>Name</em>}</li>
 *   <li>{@link swaggerDSL.impl.ResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.impl.ResponseImpl#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link swaggerDSL.impl.ResponseImpl#getSchemaRef <em>Schema Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaType()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaType()
	 * @generated
	 * @ordered
	 */
	protected String schemaType = SCHEMA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaRef() <em>Schema Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaRef() <em>Schema Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaRef()
	 * @generated
	 * @ordered
	 */
	protected String schemaRef = SCHEMA_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerDSLPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.RESPONSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.RESPONSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaType() {
		return schemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaType(String newSchemaType) {
		String oldSchemaType = schemaType;
		schemaType = newSchemaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.RESPONSE__SCHEMA_TYPE, oldSchemaType, schemaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaRef() {
		return schemaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaRef(String newSchemaRef) {
		String oldSchemaRef = schemaRef;
		schemaRef = newSchemaRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.RESPONSE__SCHEMA_REF, oldSchemaRef, schemaRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwaggerDSLPackage.RESPONSE__NAME:
				return getName();
			case SwaggerDSLPackage.RESPONSE__DESCRIPTION:
				return getDescription();
			case SwaggerDSLPackage.RESPONSE__SCHEMA_TYPE:
				return getSchemaType();
			case SwaggerDSLPackage.RESPONSE__SCHEMA_REF:
				return getSchemaRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwaggerDSLPackage.RESPONSE__NAME:
				setName((String)newValue);
				return;
			case SwaggerDSLPackage.RESPONSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SwaggerDSLPackage.RESPONSE__SCHEMA_TYPE:
				setSchemaType((String)newValue);
				return;
			case SwaggerDSLPackage.RESPONSE__SCHEMA_REF:
				setSchemaRef((String)newValue);
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
			case SwaggerDSLPackage.RESPONSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SwaggerDSLPackage.RESPONSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SwaggerDSLPackage.RESPONSE__SCHEMA_TYPE:
				setSchemaType(SCHEMA_TYPE_EDEFAULT);
				return;
			case SwaggerDSLPackage.RESPONSE__SCHEMA_REF:
				setSchemaRef(SCHEMA_REF_EDEFAULT);
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
			case SwaggerDSLPackage.RESPONSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SwaggerDSLPackage.RESPONSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SwaggerDSLPackage.RESPONSE__SCHEMA_TYPE:
				return SCHEMA_TYPE_EDEFAULT == null ? schemaType != null : !SCHEMA_TYPE_EDEFAULT.equals(schemaType);
			case SwaggerDSLPackage.RESPONSE__SCHEMA_REF:
				return SCHEMA_REF_EDEFAULT == null ? schemaRef != null : !SCHEMA_REF_EDEFAULT.equals(schemaRef);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", schemaType: ");
		result.append(schemaType);
		result.append(", schemaRef: ");
		result.append(schemaRef);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
