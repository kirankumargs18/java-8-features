package com.globallogic.methodreference;

@FunctionalInterface
interface Methods {
	void sayHello();

	default void sayThankYou() {
		System.out.println("Thank you...");
	}
}

public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Methods method = new Methods() {
		 * 
		 * @Override public void sayHello() { System.out.println("Hello....");
		 * 
		 * } };
		 */
		Methods method = () -> System.out.println("Hello");

		method.sayThankYou();
		method.sayHello();
	}

}
