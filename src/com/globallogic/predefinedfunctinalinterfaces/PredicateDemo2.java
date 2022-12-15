package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.Predicate;

/*public interface Predicate<T> {
	boolean test(T t);
}*/

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = { 85, 83, 75, 90, 88, 81, 80 };

		Predicate<Integer> predicate = score -> score >= 85;
		Predicate<Integer> predicate2 = score -> score >= 85;

		System.out.println("Distinction scores :");
		printScores(predicate, marks);

		System.out.println("First class scores : ");
		printScores(predicate2, marks);

	}

	public static void printScores(Predicate<Integer> p, int[] array) {

		for (int x : array) {
			if (p.test(x)) {
				System.out.println(x);
			}
		}
	}

}
