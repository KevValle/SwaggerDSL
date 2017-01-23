/**
 */
package swaggerDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import swaggerDSL.Parameters;
import swaggerDSL.SwaggerDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#getName <em>Name</em>}</li>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#getIn <em>In</em>}</li>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link swaggerDSL.impl.ParametersImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametersImpl extends MinimalEObjectImpl.Container implements Parameters {
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
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

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
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerDSLPackage.Literals.PARAMETERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__IN, oldIn, in));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerDSLPackage.PARAMETERS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwaggerDSLPackage.PARAMETERS__NAME:
				return getName();
			case SwaggerDSLPackage.PARAMETERS__IN:
				return getIn();
			case SwaggerDSLPackage.PARAMETERS__DESCRIPTION:
				return getDescription();
			case SwaggerDSLPackage.PARAMETERS__REQUIRED:
				return isRequired();
			case SwaggerDSLPackage.PARAMETERS__FORMAT:
				return getFormat();
			case SwaggerDSLPackage.PARAMETERS__TYPE:
				return getType();
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
			case SwaggerDSLPackage.PARAMETERS__NAME:
				setName((String)newValue);
				return;
			case SwaggerDSLPackage.PARAMETERS__IN:
				setIn((String)newValue);
				return;
			case SwaggerDSLPackage.PARAMETERS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SwaggerDSLPackage.PARAMETERS__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case SwaggerDSLPackage.PARAMETERS__FORMAT:
				setFormat((String)newValue);
				return;
			case SwaggerDSLPackage.PARAMETERS__TYPE:
				setType((String)newValue);
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
			case SwaggerDSLPackage.PARAMETERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SwaggerDSLPackage.PARAMETERS__IN:
				setIn(IN_EDEFAULT);
				return;
			case SwaggerDSLPackage.PARAMETERS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SwaggerDSLPackage.PARAMETERS__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case SwaggerDSLPackage.PARAMETERS__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case SwaggerDSLPackage.PARAMETERS__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SwaggerDSLPackage.PARAMETERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SwaggerDSLPackage.PARAMETERS__IN:
				return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
			case SwaggerDSLPackage.PARAMETERS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SwaggerDSLPackage.PARAMETERS__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case SwaggerDSLPackage.PARAMETERS__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case SwaggerDSLPackage.PARAMETERS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", in: ");
		result.append(in);
		result.append(", description: ");
		result.append(description);
		result.append(", required: ");
		result.append(required);
		result.append(", format: ");
		result.append(format);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParametersImpl
