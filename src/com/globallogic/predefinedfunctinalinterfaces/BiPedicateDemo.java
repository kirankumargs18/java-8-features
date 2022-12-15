package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.BiPredicate;

/*interface BiPredicate<T, U> {
	boolean test(T t, U u)
}*/

public class BiPedicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredicate = (a, b) -> a == b;
		
		System.out.println("2 and 2 are equal : "+biPredicate.test(2, 2));
		
		System.out.println("2 and 3 are equal : "+biPredicate.test(2, 3));

	}

}
