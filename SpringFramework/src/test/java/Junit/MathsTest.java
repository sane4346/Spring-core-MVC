package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathsTest {

	MathsCalculations calc = new MathsCalculations();

	
	//MathsCalculation class's sum func test with 1,2,3
	
	
	@Test
	public void test_sum_of_numbers() {
		System.out.println("Test1");
		int totalSum = calc.sum(new int [] {1,2,3,4,5,6,7,8,9,10});
		assertEquals(55,totalSum);
	}
	
	@Test
	public void test_with_1Number() {
		System.out.println("Test2");
		assertEquals(3,calc.sum(new int [] {3}));

	}
	
	
	//Other important annotations
	
	//Before method is executed before every test :- this method is useful when some connections to DB is required  
	// or some precondition is required for every tests
	@Before
	public void beforeEveryTest() {
		System.out.println("Before");
	}
	
	// After : it runs after every test
	@After
	public void afterEveryTest() {
		System.out.println("After");
	}
	
	//Mark :-  Before class runs before all tests , these are class level functions so 'static'  keyword is needed.
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("Before Class");
	}
	
	// After : it runs after all test
	@AfterClass
	public static void afterAllTest() {
		System.out.println("After Class");
	}

}
