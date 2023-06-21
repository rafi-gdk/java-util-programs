package com.sonu.utils.streams.filteringAndSlicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    ##### Filtering Unique Elements ######
    
 	# Stream supports a  method called 'distinct' that return a stream with unique elements
 */


public class FilteringUniqueElements {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
		number = number.stream().filter(n -> n % 2==0)
		.distinct()
		.collect(Collectors.toList());
		System.out.println(number);
	}

}
