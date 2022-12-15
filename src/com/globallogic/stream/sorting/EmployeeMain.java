package com.globallogic.stream.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(

				new Employee(11, "Kiran", "DEV", 45000, 23), new Employee(12, "Kumar", "HR", 30000, 23),
				new Employee(13, "G S", "DEV", 60000, 25), new Employee(14, "Naveen", "DEV", 70000, 27),
				new Employee(15, "Shravan", "HR", 50000, 30)));

		System.out.println("Sorting By ID : ");
		employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).forEach(System.out::println);

		System.out.println("\nSorting By Name : ");
		employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		System.out.println("\nSorting By Salary in reverse order : ");
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

		System.out.println("\nSorting By Age : ");
		employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

	}

}
