package com.spring.basics.SpringFramework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int [] sort(int [] numbers) {
		
		int n = numbers.length;
		Boolean isSwap = false;
		
		for(int i=0;i<n-1;i++) {
			for(int j = 0; j < n-1-i;j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					isSwap = true;
				}
			}
			if (isSwap == false) //numbers are already sorted
				break;
		}
		return numbers;
	}
	

}
