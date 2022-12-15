package com.globallogic.stream.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsDemo {

	public static void main(String[] args) {

		/*
		 * filter()
		 * 
		 * If you want to return a stream from another stream that satisfies a given
		 * condition.(Predicate)
		 */

		System.out.println("\nfilter() : ");
		Stream<String> animals = Stream.of("Lion", "Tiger", "Dog", "Elephant");
		animals.filter(animal -> animal.length() >= 4).forEach(System.out::println); // method reference

		// animals.filter(animal -> animal.length() >= 4).forEach(animal ->
		// System.out.println(animal));

		/*
		 * distinct()
		 * 
		 * To print the stream with unique values
		 */

		System.out.println("\ndistinct() : ");
		Stream<Integer> ints2 = Stream.of(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 10);
		ints2.distinct().forEach(System.out::println);

		/*
		 * skip(n) --> to get first n elements in the stream and limit(n) --> to get
		 * finite stream from infinite stream
		 */

		System.out.println("\nskip() and limit() : ");
		Stream<Integer> ints3 = Stream.iterate(1, n -> n + 1); // produces infinite stream from 1.....infinity
		ints3.skip(9).limit(11).forEach(System.out::println);

		/*
		 * map() --> to transform to single value and flatMap() --> to transform to
		 * multiple values
		 */
		System.out.println("\nmap() and flatMap() : ");

		List<Programmers> list = new ArrayList<>();
		list.add(new Programmers("kiran", new ArrayList<String>(Arrays.asList("Java", "Python"))));
		list.add(new Programmers("kumar", new ArrayList<String>(Arrays.asList("Java", "SQL"))));
		list.add(new Programmers("naveen", new ArrayList<String>(Arrays.asList("SQL", "Python"))));
		list.add(new Programmers("shravan", new ArrayList<String>(Arrays.asList("Angular", "Python"))));

		// Map
		List<String> names = list.stream().map(Programmers::getName).collect(Collectors.toList());
		System.out.println(names);

		// flatMap
		List<String> list1 = list.stream().flatMap(p -> p.getSkills().stream()).distinct().collect(Collectors.toList());
		System.out.println(list1);

		/*
		 * Sorted() - to sort the stream
		 */
		System.out.println("\nSorted() : ");
		System.out.println("ascending order : ");
		Stream<Integer> ints4 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8);
		ints4.sorted().forEach(s -> System.out.println(s));

		System.out.println("descending order : ");
		Stream<Integer> ints5 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8);
		ints5.sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

		/*
		 * count() - to count number of elements in the stream
		 */
		System.out.println("\nCount : ");
		Stream<Integer> ints6 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8);
		System.out.println(ints6.count());

		/*
		 * Min() - minimum element and Max() - maximum element
		 * 
		 */
		Stream<Integer> ints7 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8, 0);

		//System.out.println("Minimum element : " + ints7.min((a, b) -> a - b).get());

		System.out.println("Minimum element : " + ints7.min(Comparator.comparing(Integer::valueOf)).get());

		Stream<Integer> ints8 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8);

		System.out.println("Maximum element : " + ints8.max(Comparator.comparing(Integer::valueOf)).get());

		/*
		 * findFirst() -> to find the first element in a stream that satisfies a
		 * particular condition.
		 */
		Stream<Integer> ints9 = Stream.of(5, 4, 2, 3, 6, 1, 9, 8);
		int num = ints9.filter(number -> number %2==0).findFirst().get();
		System.out.println(num);

	}

}
