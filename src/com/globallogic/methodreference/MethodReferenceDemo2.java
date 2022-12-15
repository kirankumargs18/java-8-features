package com.globallogic.methodreference;

interface Demo3 {
	Customer getCustomer();
}

interface Demo4 {
	Customer getCustomer(int id, String name);
}

class Customer {
	int id;
	String name;

	public Customer() {
		super();
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void displayCustomerInfo() {
		System.out.println("display method");
		System.out.println("id :" + id);
		System.out.println("name :" + name);
	}

}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		Demo3 demo3 = () -> new Customer();
		demo3.getCustomer().displayCustomerInfo();
		System.out.println("======================");
		Demo3 d1 = Customer::new;
		d1.getCustomer().displayCustomerInfo();

		System.out.println("=================");
		Demo4 d4 = Customer::new;
		d4.getCustomer(1, "kiran").displayCustomerInfo();

	}

}
