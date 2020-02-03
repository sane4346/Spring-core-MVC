package Junit;

public class MathsCalculations {
	
	public int sum(int [] numbers) {
		int sum = 0, n = numbers.length;
		for(int i=0; i < n; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
