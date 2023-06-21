package com.sonu.utils.streams.stream;

import java.util.Arrays;
import java.util.List;

/*
 # The Collection interface  contains stream() method that creates sequential Streams
 */

public class StreamFromCollections {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,6,12,20);
		
		//Stream anyMatch(Predicate predicate)
		boolean answer = list.stream().anyMatch(n -> (n*(n+1))/4 == 5);
		System.out.println(answer);
	}
}
