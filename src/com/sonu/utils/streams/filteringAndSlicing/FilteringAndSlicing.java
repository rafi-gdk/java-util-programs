package com.sonu.utils.streams.filteringAndSlicing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
  In this stream we will look into 
     
     ** Filtering with a predicate
     ** Filtering unique elements
     ** Truncating a stream
     ** skipping elements
     
 */

/* 
     ##### Filtering with Predicate ####
     
     # Predicate is a functional interface and can therefore be used as the assignment target for lambda expression
       or method reference
       
     # Predicate can be used anywhere where you need to evaluate a condition on group/collection of similar objects such
       that evaluation can result either in true or false
     
     # Predicate is a functional interface it mean we can pass lambda expressions wherever predicate is expected. For
       example one such method is filter() method from 'Stream' interface
       
     # Method Declaration: Stream<T> filter(Predicate<? super T> predicate);
 */

public class FilteringAndSlicing {

	public static void main(String[] args) {
		
		Stream<Integer> listStream = Stream.of(12,20,30,1,3,5);
		List<Integer> numbers = listStream.filter(n -> n<20)
				.collect(Collectors.toList());
		System.out.println(numbers);			
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenNumbers = numberList.stream()
				.filter(isEvenDigit())
				.collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
		
	}
	public static Predicate<Integer> isEvenDigit(){
		return n -> n%2 == 0;
	}
}
