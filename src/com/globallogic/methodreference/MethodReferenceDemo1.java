package com.globallogic.methodreference;

@FunctionalInterface
interface Demo {
	void greet();
}

class Student {
	public static void greetStudent() {
		System.out.println("Hello all...");
	}

	public void greetStudnets() {
		System.out.println("Non static method");
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		// using lambda
		Demo demo = () -> System.out.println("Hello All");
		demo.greet();

		// using Method reference(static method)
		Demo demo2 = Student::greetStudent;
		demo2.greet();

		// using method reference(non static method)
		Demo demo3 = new Student()::greetStudnets;
		demo3.greet();

	}

}
