import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubstract() {
		
		int a = 8375;
		int b = 4281;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 4094;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		
		int a = 1893;
		int b = 2000;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 3786000;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		
		int a = 5000;
		int b = 2500;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 2;
		assertEquals (expected, actual);
	}
}
