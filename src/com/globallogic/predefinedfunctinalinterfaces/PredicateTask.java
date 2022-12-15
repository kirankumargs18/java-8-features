package com.globallogic.predefinedfunctinalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>(
				Arrays.asList("rahul", "karan", "sourab", "manish", "john", "sachin"));

		Predicate<String> predicate = (name) -> name.startsWith("s");

		Predicate<String> predicate1 = (name) -> name.contains("a");

		System.out.println("Names starting with s : ");
		checkCondition(predicate, names);

		System.out.println("Names which contains 'a' : ");
		checkCondition(predicate1, names);

	}

	private static void checkCondition(Predicate<String> p, ArrayList<String> stringLists) {

		for (String name : stringLists) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
		System.out.println();

	}
	

}
