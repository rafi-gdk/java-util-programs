package com.sonu.utils.streams.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 # An infinite Stream is a Stream with a data source capable of generating infinite
   no of elements
 # The Stream interface contains 2 static methods to generate an infinite Streams
    
      generate : Generates Sequential unordered stream
      iterate : Generates Sequential ordered stream
      
 
 */

public class StreamFromIterate {
	public static void main(String[] args) {
		Stream<Integer>  infiniteStream = Stream.iterate(0, i -> i+2);
		List<Integer> collect = infiniteStream.limit(10)
				                .collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
