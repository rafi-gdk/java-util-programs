package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>   displayData= list.stream().filter(number -> number>5)
		.limit(4).collect(Collectors.toList());
		System.out.println(displayData);
		
	}
}
