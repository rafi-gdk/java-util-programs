package streams.collectors;

public class Collectors {
	/*
	 # Other than collecting to list we can do reducing operations as well by using collectors
	   -> Reducing and summarizing streams elements a single value
	   -> Grouping elements
	   -> Partitioning elements
	   
	 count : 
	 
	 long count = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.counting());
	 
	 sum :
	 long sum = numbers.stream().collect(Collectors.summingInt(n -> n));
	 
	 average :
	 double avg = numbers.stream().collect(Collectors.averageInt(n -> n));
	 
	 Max and min:
	 Comparator<Integer> numbercomp = Comparator.comparingInt(n -> n);
	 Optional<Integer> maxOptional = numbers.stream().collect(Collectors.maxBy(numbercomp));
	 System.out.println("min::" + minOptional.orElse(0));
	   
	 */
}
