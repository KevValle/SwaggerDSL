/**
 */
package swaggerDSL.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import swaggerDSL.Swagger;
import swaggerDSL.SwaggerDSLFactory;
import swaggerDSL.SwaggerDSLPackage;

/**
 * This is the item provider adapter for a {@link swaggerDSL.Swagger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwaggerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSwaggerPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addSchemesPropertyDescriptor(object);
			addBasePathPropertyDescriptor(object);
			addProducesPropertyDescriptor(object);
			addInfoTitlePropertyDescriptor(object);
			addInfoDescriptionPropertyDescriptor(object);
			addInfoVersionPropertyDescriptor(object);
			addConsumesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Swagger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwaggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_swagger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_swagger_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__SWAGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_host_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schemes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_schemes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_schemes_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__SCHEMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_basePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_basePath_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_produces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_produces_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__PRODUCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_infoTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_infoTitle_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__INFO_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_infoDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_infoDescription_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__INFO_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_infoVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_infoVersion_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__INFO_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Swagger_consumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Swagger_consumes_feature", "_UI_Swagger_type"),
				 SwaggerDSLPackage.Literals.SWAGGER__CONSUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__PATH);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__DEFINITION);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__AUX_PROPERTIES);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__AUX_RESPONSE);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__AUX_PARAMETERS);
			childrenFeatures.add(SwaggerDSLPackage.Literals.SWAGGER__AUX_TAGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Swagger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Swagger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Swagger swagger = (Swagger)object;
		return getString("_UI_Swagger_type") + " " + swagger.getSwagger();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Swagger.class)) {
			case SwaggerDSLPackage.SWAGGER__SWAGGER:
			case SwaggerDSLPackage.SWAGGER__HOST:
			case SwaggerDSLPackage.SWAGGER__SCHEMES:
			case SwaggerDSLPackage.SWAGGER__BASE_PATH:
			case SwaggerDSLPackage.SWAGGER__PRODUCES:
			case SwaggerDSLPackage.SWAGGER__INFO_TITLE:
			case SwaggerDSLPackage.SWAGGER__INFO_DESCRIPTION:
			case SwaggerDSLPackage.SWAGGER__INFO_VERSION:
			case SwaggerDSLPackage.SWAGGER__CONSUMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SwaggerDSLPackage.SWAGGER__PATH:
			case SwaggerDSLPackage.SWAGGER__DEFINITION:
			case SwaggerDSLPackage.SWAGGER__AUX_PROPERTIES:
			case SwaggerDSLPackage.SWAGGER__AUX_RESPONSE:
			case SwaggerDSLPackage.SWAGGER__AUX_PARAMETERS:
			case SwaggerDSLPackage.SWAGGER__AUX_TAGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__PATH,
				 SwaggerDSLFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__DEFINITION,
				 SwaggerDSLFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__AUX_PROPERTIES,
				 SwaggerDSLFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__AUX_RESPONSE,
				 SwaggerDSLFactory.eINSTANCE.createResponse()));

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__AUX_PARAMETERS,
				 SwaggerDSLFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(SwaggerDSLPackage.Literals.SWAGGER__AUX_TAGS,
				 SwaggerDSLFactory.eINSTANCE.createTags()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SwaggerDSLEditPlugin.INSTANCE;
	}

}
