package com.globallogic.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globallogic.model.Employee;
import com.globallogic.service.EmployeeService;

public class EmployeeApllication {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(

				new Employee(11, "Kiran", "DEV", 45000, 23), new Employee(12, "Kumar", "HR", 30000, 23),
				new Employee(13, "G S", "DEV", 60000, 25), new Employee(14, "Naveen", "DEV", 70000, 27),
				new Employee(15, "Shravan", "HR", 50000, 30)));

		System.out.println("Number of employees in DEV department : "
				+ employeeService.countOfEmployees(employeeList.stream(), "DEV"));

		System.out.println("Number of employees in HR department : "
				+ employeeService.countOfEmployees(employeeList.stream(), "HR"));

		System.out.println("Salaries of all employees in HR department : "
				+ employeeService.allEmployeeSalaryInHr(employeeList.stream()));

		System.out.println("Incremented salaries list : " + employeeService.incrementSalary(employeeList));

	}

}
