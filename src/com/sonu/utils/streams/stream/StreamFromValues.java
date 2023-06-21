package com.sonu.utils.streams.stream;

import java.util.stream.Stream;

/*
 The Stream interface contains 2 'of()' overloaded methods to create sequential streams
 from a single value and multiple values
 
 1. Stream.of(val1, val2, val3,....)
 2. Stram.of(arrayOfElements)
 */


public class StreamFromValues {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		//stream.forEach(p -> System.out.print(p)); // this & below line both give same o/p
		stream.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream1.forEach(p -> System.out.print(p));
	}

}
