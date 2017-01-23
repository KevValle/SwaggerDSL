/**
 */
package swaggerDSL.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import swaggerDSL.Swagger;
import swaggerDSL.SwaggerDSLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Swagger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwaggerTest extends TestCase {

	/**
	 * The fixture for this Swagger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Swagger fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwaggerTest.class);
	}

	/**
	 * Constructs a new Swagger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Swagger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Swagger fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Swagger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Swagger getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SwaggerDSLFactory.eINSTANCE.createSwagger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SwaggerTest
