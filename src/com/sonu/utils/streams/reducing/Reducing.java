package com.sonu.utils.streams.reducing;

public class Reducing {
	
	/*
	 # Reducers are used to combine the elements of streams to express more complicated queries as
	   -> calculating the sum of all the elements in the stream
	   -> Highest number from stream
	   -> min, max etc
	   
	 # Queries combine all the elements in the Stream repeatedly to produce a single value such as Integer
	 # These queries cab be classified as reduction operations
	 
	 ##### Summing the elements #######
	 
	 int sum = products.stream().map(Product :: getPrice)
	 			. reduce(0, (p1,p2) -> (p1 + p2));
	 System.out.println("Sum of all the prices: " + sum);
	 
	 ######## Multiply ##########
	 int multiply = products.stream().map(Product :: getPrice)
	 				.reduce(0, (p1,p2) -> (p1 * p2));
	 System.out.println("sum of all the prices: " + sum );
	 
	 ####### Reducers without Initial Values #####
	 
  * There is an overloaded variant of reduce that doesn't take an initial value. But it return 
	 Optional object.
  
  	Optional<Integer> sum = products.stream().map(Product :: getPrice)
  							.reduce((p1,p2) -> (p1+p2));
  	System.out.println("sum using or else ::" + sum.orElse(0));
	 */
}
