package com.globallogic.predefinedfunctinalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/*interface Function<T, R> {
	R apply(T t);
}*/

public class FunctionDemo {

	public static void main(String[] args) {

		ArrayList<String> teams = new ArrayList<>(Arrays.asList("India", "Nepal", "Bangladesh", "Canada"));

		Function<String, Integer> function = (string) -> string.length();

		System.out.println("Country Names with their length");

		for (String country : teams) {
			System.out.println(country + ":" + function.apply(country));
		}

	}

}
