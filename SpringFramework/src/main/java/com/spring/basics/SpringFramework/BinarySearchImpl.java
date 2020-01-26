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
		System.out.println(sortAlgorithm);
		return 3;
		
	}

}
