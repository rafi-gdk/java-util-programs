package com.sonu.utils.streams.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  The Arrays class in the 'java.util' package contains an overloaded Stream() static method
 	to create sequential Streams from Arrays.
 */

public class StreamFromArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		Integer sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>   displayData= list.stream().filter(number -> number>5)
		.limit(4).collect(Collectors.toList());
		System.out.println(displayData);
	}
}
