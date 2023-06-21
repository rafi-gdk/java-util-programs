package com.sonu.utils.streams.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
	
	/*
	 #	The map() function is a method in the stream class that represents a functional
	 	programming concept. In simple words, the map() is used to 'transform one object into
	 	other by applying a function'
	 	
	 # That's why the stream.map(Function mapper) takes function as an argument. For example
	   by using the map() function, you can convert a list of Strings into a list of Integer
	   by applying the 'Integer.valueOf()' method to each string on the input list.
	 */
	
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1","2","3","4","5","6","7","8");
		List<Integer> evenNumbers = numbers.stream().
		map(s -> Integer.valueOf(s))
		.filter(number -> number%2 ==0)
		.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
	}
	
	
}
