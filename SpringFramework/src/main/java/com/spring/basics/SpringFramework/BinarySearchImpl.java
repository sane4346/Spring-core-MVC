package com.spring.basics.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
//Constructor Injection :- if dependency is mandatory we should use constructor injection

	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	//Setter Injection :- if dependency is optional we can use setter injection.. 
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

// If we don't use none of the above mentioned injections , compiler automatically generate setter injection 
//if bean is set to dependent class.

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
