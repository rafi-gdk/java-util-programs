package com.sonu.utils.streams.findingNmatching;

public class FindingNMatching {
	
	/*
	 #	Another common data processing idiom for finding whether some elements in a set 
	 	of data match a given property.
	 
	 #	The stream API provides such facilities through
	 	
	 	1. allMatch
	 	2. anyMatch
	 	3. nonMatch
	 	4. findFirst
	 	5. findAny
	 */
	
	/*
	 	#############   anyMatch   ##############
	 *  Checking to see if predicate matches atleast one element
	 
	 Ex: boolean anyMatchStatus = products.stream().anyMatch(p -> p.getPrice() == 12 );
	     System.out.println("Any product with 12 ::" + anyMatchStatus);
	     
	     ############   allMatch   ##############
	  *	 checking to see if predicate matches with all elements
	  
	  Ex: boolean allMatchStatus = products.stream().allMatch(p -> p.getPrice() >2);
	      System.out.println("If all product price with >2 ::" + allMatchStatus);
	      
	     ############ noneMatch ################
	     
	     Opposite to allMatch no elements in the stream matches with Predict
	     
	     boolean noneMatchStatus = products.stream().noneMatch(p -> p.getPrice >2);
	     System.out.println("If no element product price with > 2 ::" + noneMatchStatus);
	     
	     ############ findAny  #############
	     
	     returns any no of matching element of the current stream'
	     
	     List<Product> products = Arrays.asList(new Product("abc", 12. "cloth"), new 
	     	Product("xyz", 3,"footwear"),new Product("njj", 12, "cloth"));
	     	
	     Optional<Product> productOptional = products.stream().filter(p -> p.getPrice() >5).findAny();
	     Product p = productOptional.orElseThrow() -> new RuntimeException("no data exist");
	     System.out.println(p);
	     
	     ############### findFirst #############
	     
	     Find the first element from the given stream
	     
	     Optional<Product> productFirstOptional = products.stream().filter(p -> p.getPrice() > 2).
	     			findFirst();
	     Product p1 = productFirstOptional.orElseThrow -> new RuntimeException("no data exist");
	     System.out.println(p1);
	     
	     ###############################################
	     
	     
	   # Optional<T> class is a container class to represent the existence or absence of value
	   # The main advantage of this new construct is that no more too many null checks and NPE (NullPointerException)
	   # It avoids any runtime NullPointerExceptions and supports us in developing clean and neat
	     Java API's or Applications
	 */
}
