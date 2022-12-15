package com.globallogic.stream.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookMain {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>(
				Arrays.asList(new Book("Maths", 500), new Book("Science", 300), new Book("Kannad", 400)));

		System.out.println("\nSorted using page no : ");
		List<Book> booksSortedByName = books.stream().sorted(Comparator.comparing(Book::getName))
				.collect(Collectors.toList());
		booksSortedByName.forEach(System.out::println);

		System.out.println("\nSorted using page no : ");
		List<Book> booksSortedByPageNo = books.stream().sorted(Comparator.comparing(Book::getNoOfPages))
				.collect(Collectors.toList());
		booksSortedByPageNo.forEach(System.out::println);

	}

}
