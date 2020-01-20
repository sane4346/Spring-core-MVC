package com.spring.basics.SpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int number =  binarySearch.binarySearch(new int [] {12,4,6},3);
		System.out.println(number);
	//	SpringApplication.run(SpringFrameworkApplication.class, args);
		
	}

}
