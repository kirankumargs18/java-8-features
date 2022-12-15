package com.globallogic.methodreference;

interface A {

	void getName(String name);
}

public class MethodReference {

	public MethodReference() {

	}

	public MethodReference(String str) {
		System.out.println(str);
	}

	public static void getInfo(String str) {
		System.out.println(str);
	}

	public void printName(String str1) {
		System.out.println(str1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda expression
		A a = (name) -> System.out.println(name);
		a.getName("Kiran");

		// referring static method
		A a1 = MethodReference::getInfo;
		a1.getName("Nandish");

		// referring non static method
		A a2 = new MethodReference()::printName;
		a2.getName("Ganhguly");

		// referring to constructor
		A a3 = MethodReference::new;
		a3.getName("Bhayanna");

	}

}
