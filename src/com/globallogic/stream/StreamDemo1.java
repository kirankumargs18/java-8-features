package com.globallogic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Stream is a pipeline to process the data stored in collection objects.
 * A stream does not store data. 
 * An operation on a stream does not modify its source, but simply produces a result. 
 * Collections have a finite size, but streams do not.
 * */
public class StreamDemo1 {

	public static void main(String[] args) {

		// without stream

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(numbers);

		// even numbers
		System.out.println("Even numbers : ");
		System.out.println("Without Stream : ");
		for (Integer i : numbers) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// With Stream

		System.out.println("\nWith Stream : ");
		numbers.stream().filter(p -> p % 2 == 0).forEach(s -> System.out.println(s));

	}

}
