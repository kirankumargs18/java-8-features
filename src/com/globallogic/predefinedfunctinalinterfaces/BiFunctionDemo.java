package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<String, String, String> concatenate = (a, b) -> a + b;
		
		System.out.println(concatenate.apply("Kiran ", "G S"));

	}

}
