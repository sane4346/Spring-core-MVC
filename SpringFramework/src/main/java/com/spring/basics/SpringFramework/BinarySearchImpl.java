package com.spring.basics.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int [] numbers,int x) {
		//sort the numbers by® calling sorting algorithm
		//logic for search
		//BubbleSortAlgorithm sortAlgo = new BubbleSortAlgorithm();
		sortAlgorithm.sort(numbers);
		int n = numbers.length;
		for(int i=0; i < n; i++)
			System.out.print(numbers[i] + "  ");
		System.out.println(">" + sortAlgorithm);
		return 3;
		
	}

}
