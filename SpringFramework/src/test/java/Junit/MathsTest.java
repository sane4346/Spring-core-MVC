package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsTest {

	//MathsCalculation class's sum func test with 1,2,3
	
	@Test
	public void test_sum_of_numbers() {
		MathsCalculations calc = new MathsCalculations();
		System.out.print(calc.sum(new int [] {1,2,3,4,5,6,7,8,9,10}));
	}

}
