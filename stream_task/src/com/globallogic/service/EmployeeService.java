package com.globallogic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.globallogic.model.Employee;

public class EmployeeService {

	public EmployeeService() {
		super();
	}

	/*
	 * @Description : To get list of all employees in provided department
	 * 
	 * @Param : Takes stream of employees and department as arguments
	 * 
	 * @Retunrns : List of all employees in provided department
	 */

	public long countOfEmployees(Stream<Employee> empStream, String department) {

		return empStream.filter(employee -> employee.getDepartment().equals(department)).count();

	}

	/*
	 * @Description : To get list of salaries of all employees in HR department
	 * 
	 * @Param : Takes stream of employees as argument
	 * 
	 * @Retunrns : List of all employees in provided department
	 */

	public List<Integer> allEmployeeSalaryInHr(Stream<Employee> empStream) {

		List<Integer> listOfSalaries = new ArrayList<Integer>();

		Consumer<Employee> consumer = (employee) -> {
			listOfSalaries.add(employee.getSalary());
		};

		empStream.filter(employee -> employee.getDepartment().equals("HR")).forEach(consumer);

		return listOfSalaries;

	}

	/*
	 * @Description : To get list of all employees with updated salaries
	 * 
	 * @Param : Takes list of employees and increment percentage as arguments
	 * 
	 * @Retunrns : List of all employees
	 */

	public List<Double> incrementSalary(List<Employee> employeeList) {

		List<Double> empList = new ArrayList<>();

		List<Double> devList = employeeList.stream().filter(e -> e.getDepartment().equals("DEV"))
				.map(e -> (e.getSalary() + e.getSalary() * 0.2)).collect(Collectors.toList());
		List<Double> hrList = employeeList.stream().filter(e -> e.getDepartment().equals("HR"))
				.map(e -> (e.getSalary() + e.getSalary() * 0.1)).collect(Collectors.toList());

		empList.addAll(devList);
		empList.addAll(hrList);
		
		return empList;

	}

}
