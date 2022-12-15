package com.globallogic.methodreference;

interface M {

	Employee getEmployee();
}

interface N {
	Employee getEmployee(int id, String name);
}

class Employee {

	int id;
	String name;

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void displayInfo() {

		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
	}

}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Method reference to default constructor");

		M m = Employee::new;
		m.getEmployee().displayInfo();

		System.out.println("Method reference to parameterized constructor");

		N n = Employee::new;
		n.getEmployee(123, "kiran").displayInfo();

	}

}
