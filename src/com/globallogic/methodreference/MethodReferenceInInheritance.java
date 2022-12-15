package com.globallogic.methodreference;

interface B {
	public void sayHello();
}

class SuperClass {

	void superHello() {
		System.out.println("Hello... from super class");
	}
}

class ChildClass extends SuperClass {

	void childHello() {
		System.out.println("Hello... from child class");
	}

	void testHello() {

		// ***Using Method reference :super class method***//
		B a1 = super::superHello;
		a1.sayHello();

		// ***Using Lambda Expression :super class method***//
		B a2 = () -> System.out.println("Hello... from lambda");
		a2.sayHello();

		// ***Using Method reference :current class method***//
		B a3 = this::childHello;
		a3.sayHello();

	}
}

public class MethodReferenceInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child = new ChildClass();
		child.testHello();

	}

}
