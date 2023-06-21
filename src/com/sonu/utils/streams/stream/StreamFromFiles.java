package com.sonu.utils.streams.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 #	Java 8 had added many methods in 'java.io' and 'java.nio.io' package to support I/O
    Operations using streams.
    
 */

public class StreamFromFiles {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String filepath = "src\\com\\sonu\\corejava\\streams\\application.properties";
		try(Stream<String> stream  = Files.lines(Paths.get(filepath))){
			stream.filter(line -> !line.startsWith(" "))
			.map(String:: toUpperCase).forEach(System.out::println);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
