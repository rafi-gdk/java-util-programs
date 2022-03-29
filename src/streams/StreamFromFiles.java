package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 #	Java 8 had added many methods in 'java.io' and 'java.nio.io' package to support I/O
    Operations using streams.
    
 */

public class StreamFromFiles {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String filepath = "/Users/santhoshmore/eclipse-workspace/Java8-practice/src/java8/streams/application.properties";
		try(Stream<String> stream  = Files.lines(Paths.get(filepath))){
			list = stream.filter(line -> !line.startsWith(" "))
			.map(String:: toUpperCase)
			.collect(Collectors.toList());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		list.forEach(System.out::println);
	}
}
