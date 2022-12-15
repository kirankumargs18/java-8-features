package com.globallogic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreamDemo {

	public static void main(String[] args) {

		/*
		 * Using Stream.of() method
		 */

		System.out.println("Streams using Stream.of() method");
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");

		Integer[] array = { 10, 20, 30, 40, 50 }; // array type must be non primitive
		Stream<Integer> arrayNumbers = Stream.of(array);

		numbers.forEach(System.out::println);

		streamOfStrings.forEach(s -> System.out.println(s));

		// creating empty stream
		Stream<String> emptyStream = Stream.empty();

		// list to stream
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Stream<Integer> intStream = list.stream();

		// stream to list
		Stream<Integer> intStream2 = Stream.of(10, 20, 30, 40, 50);
		List<Integer> intList = intStream.collect(Collectors.toList());
		
		//note : int to Inetegr in stream conversion
		
		List<Integer> ints = Stream.of(1,2,3,4,5,6,7).collect(Collectors.toList());

	}

}
