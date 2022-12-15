package com.globallogic.methodreference;

@FunctionalInterface
interface CalculateCube {
	int cube(int a);
}

@FunctionalInterface
interface LargestOfThree {
	int largest(int a, int b, int c);
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateCube calculateCube = a -> a * a * a;

		System.out.println("================Cube===============");
		System.out.println(calculateCube.cube(2));

		LargestOfThree largest = (a, b, c) -> {
			if (a > b && a > c) {
				return a;
			} else if (b > c) {
				return b;
			} else {
				return c;
			}
		};

		System.out.println("===================largestOfThree===========");

		System.out.println(largest.largest(5, 10, 17));
	}

}
