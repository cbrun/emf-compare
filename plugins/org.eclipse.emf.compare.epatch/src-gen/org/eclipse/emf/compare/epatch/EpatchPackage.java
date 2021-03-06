/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.compare.epatch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.compare.epatch.EpatchFactory
 * @model kind="package"
 * @generated
 */
public interface EpatchPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "epatch";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.eclipse.org/emf/compare/epatch/0.1";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "epatch";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EpatchPackage eINSTANCE = org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.EpatchImpl <em>Epatch</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getEpatch()
	 * @generated
	 */
  int EPATCH = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPATCH__NAME = 0;

  /**
	 * The feature id for the '<em><b>Model Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPATCH__MODEL_IMPORTS = 1;

  /**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPATCH__RESOURCES = 2;

  /**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPATCH__OBJECTS = 3;

  /**
	 * The number of structural features of the '<em>Epatch</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPATCH_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ModelImportImpl <em>Model Import</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ModelImportImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getModelImport()
	 * @generated
	 */
  int MODEL_IMPORT = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_IMPORT__NAME = 0;

  /**
	 * The number of structural features of the '<em>Model Import</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_IMPORT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ResourceImportImpl <em>Resource Import</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ResourceImportImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getResourceImport()
	 * @generated
	 */
  int RESOURCE_IMPORT = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_IMPORT__NAME = MODEL_IMPORT__NAME;

  /**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_IMPORT__URI = MODEL_IMPORT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Resource Import</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_IMPORT_FEATURE_COUNT = MODEL_IMPORT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.EPackageImportImpl <em>EPackage Import</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.EPackageImportImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getEPackageImport()
	 * @generated
	 */
  int EPACKAGE_IMPORT = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPACKAGE_IMPORT__NAME = MODEL_IMPORT__NAME;

  /**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPACKAGE_IMPORT__NS_URI = MODEL_IMPORT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>EPackage Import</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EPACKAGE_IMPORT_FEATURE_COUNT = MODEL_IMPORT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.NamedResourceImpl <em>Named Resource</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.NamedResourceImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getNamedResource()
	 * @generated
	 */
  int NAMED_RESOURCE = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Left Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE__LEFT_URI = 1;

  /**
	 * The feature id for the '<em><b>Left Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE__LEFT_ROOT = 2;

  /**
	 * The feature id for the '<em><b>Right Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE__RIGHT_URI = 3;

  /**
	 * The feature id for the '<em><b>Right Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE__RIGHT_ROOT = 4;

  /**
	 * The number of structural features of the '<em>Named Resource</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_RESOURCE_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.NamedObjectImpl <em>Named Object</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.NamedObjectImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getNamedObject()
	 * @generated
	 */
  int NAMED_OBJECT = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_OBJECT__NAME = 0;

  /**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_OBJECT__ASSIGNMENTS = 1;

  /**
	 * The number of structural features of the '<em>Named Object</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_OBJECT_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectRefImpl <em>Object Ref</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ObjectRefImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectRef()
	 * @generated
	 */
  int OBJECT_REF = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__NAME = NAMED_OBJECT__NAME;

  /**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__ASSIGNMENTS = NAMED_OBJECT__ASSIGNMENTS;

  /**
	 * The feature id for the '<em><b>Left Res</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__LEFT_RES = NAMED_OBJECT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Left Frag</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__LEFT_FRAG = NAMED_OBJECT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Right Res</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__RIGHT_RES = NAMED_OBJECT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Right Frag</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF__RIGHT_FRAG = NAMED_OBJECT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Object Ref</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_REF_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.CreatedObjectImpl <em>Created Object</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.CreatedObjectImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getCreatedObject()
	 * @generated
	 */
  int CREATED_OBJECT = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CREATED_OBJECT__NAME = NAMED_OBJECT__NAME;

  /**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CREATED_OBJECT__ASSIGNMENTS = NAMED_OBJECT__ASSIGNMENTS;

  /**
	 * The number of structural features of the '<em>Created Object</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CREATED_OBJECT_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.AssignmentImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getAssignment()
	 * @generated
	 */
  int ASSIGNMENT = 8;

  /**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT__FEATURE = 0;

  /**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.SingleAssignmentImpl <em>Single Assignment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.SingleAssignmentImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getSingleAssignment()
	 * @generated
	 */
  int SINGLE_ASSIGNMENT = 9;

  /**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SINGLE_ASSIGNMENT__FEATURE = ASSIGNMENT__FEATURE;

  /**
	 * The feature id for the '<em><b>Left Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SINGLE_ASSIGNMENT__LEFT_VALUE = ASSIGNMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Right Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SINGLE_ASSIGNMENT__RIGHT_VALUE = ASSIGNMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Single Assignment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SINGLE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ListAssignmentImpl <em>List Assignment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ListAssignmentImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getListAssignment()
	 * @generated
	 */
  int LIST_ASSIGNMENT = 10;

  /**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ASSIGNMENT__FEATURE = ASSIGNMENT__FEATURE;

  /**
	 * The feature id for the '<em><b>Left Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ASSIGNMENT__LEFT_VALUES = ASSIGNMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Right Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ASSIGNMENT__RIGHT_VALUES = ASSIGNMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>List Assignment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.AssignmentValueImpl <em>Assignment Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.AssignmentValueImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getAssignmentValue()
	 * @generated
	 */
  int ASSIGNMENT_VALUE = 11;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__VALUE = 0;

  /**
	 * The feature id for the '<em><b>Ref Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__REF_OBJECT = 1;

  /**
	 * The feature id for the '<em><b>Ref Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__REF_FEATURE = 2;

  /**
	 * The feature id for the '<em><b>Ref Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__REF_INDEX = 3;

  /**
	 * The feature id for the '<em><b>New Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__NEW_OBJECT = 4;

  /**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__IMPORT = 5;

  /**
	 * The feature id for the '<em><b>Imp Frag</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__IMP_FRAG = 6;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__INDEX = 7;

  /**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE__KEYWORD = 8;

  /**
	 * The number of structural features of the '<em>Assignment Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSIGNMENT_VALUE_FEATURE_COUNT = 9;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectNewImpl <em>Object New</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ObjectNewImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectNew()
	 * @generated
	 */
  int OBJECT_NEW = 12;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_NEW__NAME = CREATED_OBJECT__NAME;

  /**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_NEW__ASSIGNMENTS = CREATED_OBJECT__ASSIGNMENTS;

  /**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_NEW__IMPORT = CREATED_OBJECT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Imp Frag</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_NEW__IMP_FRAG = CREATED_OBJECT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Object New</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_NEW_FEATURE_COUNT = CREATED_OBJECT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectCopyImpl <em>Object Copy</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.compare.epatch.impl.ObjectCopyImpl
	 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectCopy()
	 * @generated
	 */
  int OBJECT_COPY = 13;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_COPY__NAME = CREATED_OBJECT__NAME;

  /**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_COPY__ASSIGNMENTS = CREATED_OBJECT__ASSIGNMENTS;

  /**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_COPY__RESOURCE = CREATED_OBJECT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_COPY__FRAGMENT = CREATED_OBJECT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Object Copy</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OBJECT_COPY_FEATURE_COUNT = CREATED_OBJECT_FEATURE_COUNT + 2;


  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.Epatch <em>Epatch</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epatch</em>'.
	 * @see org.eclipse.emf.compare.epatch.Epatch
	 * @generated
	 */
  EClass getEpatch();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.Epatch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.compare.epatch.Epatch#getName()
	 * @see #getEpatch()
	 * @generated
	 */
  EAttribute getEpatch_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.Epatch#getModelImports <em>Model Imports</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Imports</em>'.
	 * @see org.eclipse.emf.compare.epatch.Epatch#getModelImports()
	 * @see #getEpatch()
	 * @generated
	 */
  EReference getEpatch_ModelImports();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.Epatch#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.emf.compare.epatch.Epatch#getResources()
	 * @see #getEpatch()
	 * @generated
	 */
  EReference getEpatch_Resources();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.Epatch#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.eclipse.emf.compare.epatch.Epatch#getObjects()
	 * @see #getEpatch()
	 * @generated
	 */
  EReference getEpatch_Objects();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Import</em>'.
	 * @see org.eclipse.emf.compare.epatch.ModelImport
	 * @generated
	 */
  EClass getModelImport();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ModelImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.compare.epatch.ModelImport#getName()
	 * @see #getModelImport()
	 * @generated
	 */
  EAttribute getModelImport_Name();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ResourceImport <em>Resource Import</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Import</em>'.
	 * @see org.eclipse.emf.compare.epatch.ResourceImport
	 * @generated
	 */
  EClass getResourceImport();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ResourceImport#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.emf.compare.epatch.ResourceImport#getUri()
	 * @see #getResourceImport()
	 * @generated
	 */
  EAttribute getResourceImport_Uri();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.EPackageImport <em>EPackage Import</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Import</em>'.
	 * @see org.eclipse.emf.compare.epatch.EPackageImport
	 * @generated
	 */
  EClass getEPackageImport();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.EPackageImport#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see org.eclipse.emf.compare.epatch.EPackageImport#getNsURI()
	 * @see #getEPackageImport()
	 * @generated
	 */
  EAttribute getEPackageImport_NsURI();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.NamedResource <em>Named Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Resource</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource
	 * @generated
	 */
  EClass getNamedResource();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.NamedResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource#getName()
	 * @see #getNamedResource()
	 * @generated
	 */
  EAttribute getNamedResource_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.NamedResource#getLeftUri <em>Left Uri</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Uri</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource#getLeftUri()
	 * @see #getNamedResource()
	 * @generated
	 */
  EAttribute getNamedResource_LeftUri();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.compare.epatch.NamedResource#getLeftRoot <em>Left Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Root</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource#getLeftRoot()
	 * @see #getNamedResource()
	 * @generated
	 */
  EReference getNamedResource_LeftRoot();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.NamedResource#getRightUri <em>Right Uri</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Uri</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource#getRightUri()
	 * @see #getNamedResource()
	 * @generated
	 */
  EAttribute getNamedResource_RightUri();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.compare.epatch.NamedResource#getRightRoot <em>Right Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Root</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedResource#getRightRoot()
	 * @see #getNamedResource()
	 * @generated
	 */
  EReference getNamedResource_RightRoot();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.NamedObject <em>Named Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Object</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedObject
	 * @generated
	 */
  EClass getNamedObject();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.NamedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedObject#getName()
	 * @see #getNamedObject()
	 * @generated
	 */
  EAttribute getNamedObject_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.NamedObject#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.eclipse.emf.compare.epatch.NamedObject#getAssignments()
	 * @see #getNamedObject()
	 * @generated
	 */
  EReference getNamedObject_Assignments();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectRef
	 * @generated
	 */
  EClass getObjectRef();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.ObjectRef#getLeftRes <em>Left Res</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Res</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectRef#getLeftRes()
	 * @see #getObjectRef()
	 * @generated
	 */
  EReference getObjectRef_LeftRes();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ObjectRef#getLeftFrag <em>Left Frag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Frag</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectRef#getLeftFrag()
	 * @see #getObjectRef()
	 * @generated
	 */
  EAttribute getObjectRef_LeftFrag();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.ObjectRef#getRightRes <em>Right Res</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Res</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectRef#getRightRes()
	 * @see #getObjectRef()
	 * @generated
	 */
  EReference getObjectRef_RightRes();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ObjectRef#getRightFrag <em>Right Frag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Frag</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectRef#getRightFrag()
	 * @see #getObjectRef()
	 * @generated
	 */
  EAttribute getObjectRef_RightFrag();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.CreatedObject <em>Created Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created Object</em>'.
	 * @see org.eclipse.emf.compare.epatch.CreatedObject
	 * @generated
	 */
  EClass getCreatedObject();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclipse.emf.compare.epatch.Assignment
	 * @generated
	 */
  EClass getAssignment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.Assignment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.eclipse.emf.compare.epatch.Assignment#getFeature()
	 * @see #getAssignment()
	 * @generated
	 */
  EAttribute getAssignment_Feature();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.SingleAssignment <em>Single Assignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Assignment</em>'.
	 * @see org.eclipse.emf.compare.epatch.SingleAssignment
	 * @generated
	 */
  EClass getSingleAssignment();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.compare.epatch.SingleAssignment#getLeftValue <em>Left Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Value</em>'.
	 * @see org.eclipse.emf.compare.epatch.SingleAssignment#getLeftValue()
	 * @see #getSingleAssignment()
	 * @generated
	 */
  EReference getSingleAssignment_LeftValue();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.compare.epatch.SingleAssignment#getRightValue <em>Right Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Value</em>'.
	 * @see org.eclipse.emf.compare.epatch.SingleAssignment#getRightValue()
	 * @see #getSingleAssignment()
	 * @generated
	 */
  EReference getSingleAssignment_RightValue();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ListAssignment <em>List Assignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Assignment</em>'.
	 * @see org.eclipse.emf.compare.epatch.ListAssignment
	 * @generated
	 */
  EClass getListAssignment();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.ListAssignment#getLeftValues <em>Left Values</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Values</em>'.
	 * @see org.eclipse.emf.compare.epatch.ListAssignment#getLeftValues()
	 * @see #getListAssignment()
	 * @generated
	 */
  EReference getListAssignment_LeftValues();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.compare.epatch.ListAssignment#getRightValues <em>Right Values</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Values</em>'.
	 * @see org.eclipse.emf.compare.epatch.ListAssignment#getRightValues()
	 * @see #getListAssignment()
	 * @generated
	 */
  EReference getListAssignment_RightValues();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.AssignmentValue <em>Assignment Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Value</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue
	 * @generated
	 */
  EClass getAssignmentValue();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getValue()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_Value();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getRefObject <em>Ref Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Object</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getRefObject()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EReference getAssignmentValue_RefObject();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getRefFeature <em>Ref Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Feature</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getRefFeature()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_RefFeature();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getRefIndex <em>Ref Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Index</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getRefIndex()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_RefIndex();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getNewObject <em>New Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Object</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getNewObject()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EReference getAssignmentValue_NewObject();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getImport()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EReference getAssignmentValue_Import();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getImpFrag <em>Imp Frag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imp Frag</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getImpFrag()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_ImpFrag();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getIndex()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_Index();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.AssignmentValue#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.eclipse.emf.compare.epatch.AssignmentValue#getKeyword()
	 * @see #getAssignmentValue()
	 * @generated
	 */
  EAttribute getAssignmentValue_Keyword();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ObjectNew <em>Object New</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object New</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectNew
	 * @generated
	 */
  EClass getObjectNew();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.ObjectNew#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectNew#getImport()
	 * @see #getObjectNew()
	 * @generated
	 */
  EReference getObjectNew_Import();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ObjectNew#getImpFrag <em>Imp Frag</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imp Frag</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectNew#getImpFrag()
	 * @see #getObjectNew()
	 * @generated
	 */
  EAttribute getObjectNew_ImpFrag();

  /**
	 * Returns the meta object for class '{@link org.eclipse.emf.compare.epatch.ObjectCopy <em>Object Copy</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Copy</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectCopy
	 * @generated
	 */
  EClass getObjectCopy();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.compare.epatch.ObjectCopy#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectCopy#getResource()
	 * @see #getObjectCopy()
	 * @generated
	 */
  EReference getObjectCopy_Resource();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.compare.epatch.ObjectCopy#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see org.eclipse.emf.compare.epatch.ObjectCopy#getFragment()
	 * @see #getObjectCopy()
	 * @generated
	 */
  EAttribute getObjectCopy_Fragment();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EpatchFactory getEpatchFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.EpatchImpl <em>Epatch</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getEpatch()
		 * @generated
		 */
    EClass EPATCH = eINSTANCE.getEpatch();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EPATCH__NAME = eINSTANCE.getEpatch_Name();

    /**
		 * The meta object literal for the '<em><b>Model Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EPATCH__MODEL_IMPORTS = eINSTANCE.getEpatch_ModelImports();

    /**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EPATCH__RESOURCES = eINSTANCE.getEpatch_Resources();

    /**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EPATCH__OBJECTS = eINSTANCE.getEpatch_Objects();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ModelImportImpl <em>Model Import</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ModelImportImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getModelImport()
		 * @generated
		 */
    EClass MODEL_IMPORT = eINSTANCE.getModelImport();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODEL_IMPORT__NAME = eINSTANCE.getModelImport_Name();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ResourceImportImpl <em>Resource Import</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ResourceImportImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getResourceImport()
		 * @generated
		 */
    EClass RESOURCE_IMPORT = eINSTANCE.getResourceImport();

    /**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESOURCE_IMPORT__URI = eINSTANCE.getResourceImport_Uri();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.EPackageImportImpl <em>EPackage Import</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.EPackageImportImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getEPackageImport()
		 * @generated
		 */
    EClass EPACKAGE_IMPORT = eINSTANCE.getEPackageImport();

    /**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EPACKAGE_IMPORT__NS_URI = eINSTANCE.getEPackageImport_NsURI();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.NamedResourceImpl <em>Named Resource</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.NamedResourceImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getNamedResource()
		 * @generated
		 */
    EClass NAMED_RESOURCE = eINSTANCE.getNamedResource();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_RESOURCE__NAME = eINSTANCE.getNamedResource_Name();

    /**
		 * The meta object literal for the '<em><b>Left Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_RESOURCE__LEFT_URI = eINSTANCE.getNamedResource_LeftUri();

    /**
		 * The meta object literal for the '<em><b>Left Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NAMED_RESOURCE__LEFT_ROOT = eINSTANCE.getNamedResource_LeftRoot();

    /**
		 * The meta object literal for the '<em><b>Right Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_RESOURCE__RIGHT_URI = eINSTANCE.getNamedResource_RightUri();

    /**
		 * The meta object literal for the '<em><b>Right Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NAMED_RESOURCE__RIGHT_ROOT = eINSTANCE.getNamedResource_RightRoot();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.NamedObjectImpl <em>Named Object</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.NamedObjectImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getNamedObject()
		 * @generated
		 */
    EClass NAMED_OBJECT = eINSTANCE.getNamedObject();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_OBJECT__NAME = eINSTANCE.getNamedObject_Name();

    /**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NAMED_OBJECT__ASSIGNMENTS = eINSTANCE.getNamedObject_Assignments();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectRefImpl <em>Object Ref</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ObjectRefImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectRef()
		 * @generated
		 */
    EClass OBJECT_REF = eINSTANCE.getObjectRef();

    /**
		 * The meta object literal for the '<em><b>Left Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OBJECT_REF__LEFT_RES = eINSTANCE.getObjectRef_LeftRes();

    /**
		 * The meta object literal for the '<em><b>Left Frag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OBJECT_REF__LEFT_FRAG = eINSTANCE.getObjectRef_LeftFrag();

    /**
		 * The meta object literal for the '<em><b>Right Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OBJECT_REF__RIGHT_RES = eINSTANCE.getObjectRef_RightRes();

    /**
		 * The meta object literal for the '<em><b>Right Frag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OBJECT_REF__RIGHT_FRAG = eINSTANCE.getObjectRef_RightFrag();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.CreatedObjectImpl <em>Created Object</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.CreatedObjectImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getCreatedObject()
		 * @generated
		 */
    EClass CREATED_OBJECT = eINSTANCE.getCreatedObject();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.AssignmentImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getAssignment()
		 * @generated
		 */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.SingleAssignmentImpl <em>Single Assignment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.SingleAssignmentImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getSingleAssignment()
		 * @generated
		 */
    EClass SINGLE_ASSIGNMENT = eINSTANCE.getSingleAssignment();

    /**
		 * The meta object literal for the '<em><b>Left Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SINGLE_ASSIGNMENT__LEFT_VALUE = eINSTANCE.getSingleAssignment_LeftValue();

    /**
		 * The meta object literal for the '<em><b>Right Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SINGLE_ASSIGNMENT__RIGHT_VALUE = eINSTANCE.getSingleAssignment_RightValue();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ListAssignmentImpl <em>List Assignment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ListAssignmentImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getListAssignment()
		 * @generated
		 */
    EClass LIST_ASSIGNMENT = eINSTANCE.getListAssignment();

    /**
		 * The meta object literal for the '<em><b>Left Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LIST_ASSIGNMENT__LEFT_VALUES = eINSTANCE.getListAssignment_LeftValues();

    /**
		 * The meta object literal for the '<em><b>Right Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LIST_ASSIGNMENT__RIGHT_VALUES = eINSTANCE.getListAssignment_RightValues();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.AssignmentValueImpl <em>Assignment Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.AssignmentValueImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getAssignmentValue()
		 * @generated
		 */
    EClass ASSIGNMENT_VALUE = eINSTANCE.getAssignmentValue();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__VALUE = eINSTANCE.getAssignmentValue_Value();

    /**
		 * The meta object literal for the '<em><b>Ref Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ASSIGNMENT_VALUE__REF_OBJECT = eINSTANCE.getAssignmentValue_RefObject();

    /**
		 * The meta object literal for the '<em><b>Ref Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__REF_FEATURE = eINSTANCE.getAssignmentValue_RefFeature();

    /**
		 * The meta object literal for the '<em><b>Ref Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__REF_INDEX = eINSTANCE.getAssignmentValue_RefIndex();

    /**
		 * The meta object literal for the '<em><b>New Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ASSIGNMENT_VALUE__NEW_OBJECT = eINSTANCE.getAssignmentValue_NewObject();

    /**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ASSIGNMENT_VALUE__IMPORT = eINSTANCE.getAssignmentValue_Import();

    /**
		 * The meta object literal for the '<em><b>Imp Frag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__IMP_FRAG = eINSTANCE.getAssignmentValue_ImpFrag();

    /**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__INDEX = eINSTANCE.getAssignmentValue_Index();

    /**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSIGNMENT_VALUE__KEYWORD = eINSTANCE.getAssignmentValue_Keyword();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectNewImpl <em>Object New</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ObjectNewImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectNew()
		 * @generated
		 */
    EClass OBJECT_NEW = eINSTANCE.getObjectNew();

    /**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OBJECT_NEW__IMPORT = eINSTANCE.getObjectNew_Import();

    /**
		 * The meta object literal for the '<em><b>Imp Frag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OBJECT_NEW__IMP_FRAG = eINSTANCE.getObjectNew_ImpFrag();

    /**
		 * The meta object literal for the '{@link org.eclipse.emf.compare.epatch.impl.ObjectCopyImpl <em>Object Copy</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.compare.epatch.impl.ObjectCopyImpl
		 * @see org.eclipse.emf.compare.epatch.impl.EpatchPackageImpl#getObjectCopy()
		 * @generated
		 */
    EClass OBJECT_COPY = eINSTANCE.getObjectCopy();

    /**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OBJECT_COPY__RESOURCE = eINSTANCE.getObjectCopy_Resource();

    /**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OBJECT_COPY__FRAGMENT = eINSTANCE.getObjectCopy_Fragment();

  }

} //EpatchPackage
