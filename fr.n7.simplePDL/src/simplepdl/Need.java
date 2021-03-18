/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Need#getNbResources <em>Nb Resources</em>}</li>
 *   <li>{@link simplepdl.Need#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Resources</em>' attribute.
	 * @see #setNbResources(int)
	 * @see simplepdl.SimplepdlPackage#getNeed_NbResources()
	 * @model required="true"
	 * @generated
	 */
	int getNbResources();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getNbResources <em>Nb Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Resources</em>' attribute.
	 * @see #getNbResources()
	 * @generated
	 */
	void setNbResources(int value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Resource#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see simplepdl.SimplepdlPackage#getNeed_Resource()
	 * @see simplepdl.Resource#getNeeds
	 * @model opposite="needs" required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // Need
