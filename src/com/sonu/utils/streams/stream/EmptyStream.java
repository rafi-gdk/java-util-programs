package com.sonu.utils.streams.stream;

import java.util.stream.Stream;

/*
 # An Empty stream is Stream with no elements
 # The Stream interface contains an empty() static method to create an 
   empty sequential streams.
 # An Empty stream might be useful to avoid null pointer exceptions While calling
   methods with Stream Parameters 
  
 # :: is called method reference, used while using forEach() method
 */

public class EmptyStream {

	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		//stream.forEach(System.out::print);
		stream.forEach(x -> System.out.print(x));  // above line & this line gives same response
	}

}
