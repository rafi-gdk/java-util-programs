package com.sonu.utils.streams.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	#	Flat map replaces the each value of stream with another stream and then concatenates
 		all the generated stream into a single stream.
 */


public class FlatMap {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,1,23,3);
		List<Integer> number2 = Arrays.asList(6,7,8,2);
		List<List<Integer>> number3 = new ArrayList<>();
		number3.add(number);
		number3.add(number2);
		number3.parallelStream().flatMap(n -> n.stream()).distinct()
		.forEach(System.out::println);
	}
}
