/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplepdl.Need;
import simplepdl.Resource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.NeedImpl#getNbResources <em>Nb Resources</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends ProcessElementImpl implements Need {
	/**
	 * The default value of the '{@link #getNbResources() <em>Nb Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbResources()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_RESOURCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbResources() <em>Nb Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbResources()
	 * @generated
	 * @ordered
	 */
	protected int nbResources = NB_RESOURCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkdefinition() <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkdefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workdefinition;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbResources() {
		return nbResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbResources(int newNbResources) {
		int oldNbResources = nbResources;
		nbResources = newNbResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__NB_RESOURCES, oldNbResources, nbResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWorkdefinition() {
		if (workdefinition != null && workdefinition.eIsProxy()) {
			InternalEObject oldWorkdefinition = (InternalEObject)workdefinition;
			workdefinition = (WorkDefinition)eResolveProxy(oldWorkdefinition);
			if (workdefinition != oldWorkdefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.NEED__WORKDEFINITION, oldWorkdefinition, workdefinition));
			}
		}
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkdefinition() {
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkdefinition(WorkDefinition newWorkdefinition, NotificationChain msgs) {
		WorkDefinition oldWorkdefinition = workdefinition;
		workdefinition = newWorkdefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__WORKDEFINITION, oldWorkdefinition, newWorkdefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		if (newWorkdefinition != workdefinition) {
			NotificationChain msgs = null;
			if (workdefinition != null)
				msgs = ((InternalEObject)workdefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
			if (newWorkdefinition != null)
				msgs = ((InternalEObject)newWorkdefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
			msgs = basicSetWorkdefinition(newWorkdefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__WORKDEFINITION, newWorkdefinition, newWorkdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.NEED__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, SimplepdlPackage.RESOURCE__NEED, Resource.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, SimplepdlPackage.RESOURCE__NEED, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				if (workdefinition != null)
					msgs = ((InternalEObject)workdefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
				return basicSetWorkdefinition((WorkDefinition)otherEnd, msgs);
			case SimplepdlPackage.NEED__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, SimplepdlPackage.RESOURCE__NEED, Resource.class, msgs);
				return basicSetResource((Resource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return basicSetWorkdefinition(null, msgs);
			case SimplepdlPackage.NEED__RESOURCE:
				return basicSetResource(null, msgs);
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
			case SimplepdlPackage.NEED__NB_RESOURCES:
				return getNbResources();
			case SimplepdlPackage.NEED__WORKDEFINITION:
				if (resolve) return getWorkdefinition();
				return basicGetWorkdefinition();
			case SimplepdlPackage.NEED__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case SimplepdlPackage.NEED__NB_RESOURCES:
				setNbResources((Integer)newValue);
				return;
			case SimplepdlPackage.NEED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.NEED__RESOURCE:
				setResource((Resource)newValue);
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
			case SimplepdlPackage.NEED__NB_RESOURCES:
				setNbResources(NB_RESOURCES_EDEFAULT);
				return;
			case SimplepdlPackage.NEED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
				return;
			case SimplepdlPackage.NEED__RESOURCE:
				setResource((Resource)null);
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
			case SimplepdlPackage.NEED__NB_RESOURCES:
				return nbResources != NB_RESOURCES_EDEFAULT;
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return workdefinition != null;
			case SimplepdlPackage.NEED__RESOURCE:
				return resource != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nbResources: ");
		result.append(nbResources);
		result.append(')');
		return result.toString();
	}

} //NeedImpl