package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// used for conditional checks
		Predicate<Integer> predicate = (age) -> {

			if (age >= 18) {
				return true;
			}
			return false;
		};

		System.out.println(predicate.test(10));
		System.out.println(predicate.test(23));

		Predicate<String> predicate2 = (string) -> string.contains("kiran");

		System.out.println(predicate2.test("kiran kumar g s"));

	}

}
