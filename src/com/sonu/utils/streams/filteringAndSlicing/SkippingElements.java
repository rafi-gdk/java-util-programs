package com.sonu.utils.streams.filteringAndSlicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 # Stream supports the skip(n) method to return a stream that discards the first n elements
 # In the stream has fewer elements than n, then an empty stream is returned.
 */

public class SkippingElements {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,0);
		numberList = numberList.stream().filter(number -> number< 5).distinct().
		skip(2).collect(Collectors.toList());
		System.out.println(numberList);
	}

}
