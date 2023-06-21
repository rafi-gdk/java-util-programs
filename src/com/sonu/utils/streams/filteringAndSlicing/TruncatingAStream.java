package com.sonu.utils.streams.filteringAndSlicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  	##### Truncating a Stream #####
  	
  	# Stream supports the limit(n) method which returns another stream that's no longer
  	  than the give size
  	
  	# The requested size is passed as argument to limit.
 
 */


public class TruncatingAStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		numbers = numbers.stream().filter(n -> n<20).distinct()
		.limit(2).collect(Collectors.toList());
		System.out.println(numbers);
	}
}
