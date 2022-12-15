package com.globallogic.stream.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kiran
 *
 */
public class StudentMain {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(

				new Student(1l, "Kiran", "G S", 24), new Student(2l, "Manoj", "S Chalageri", 25),
				new Student(3l, "Shashi", "Kumar", 26), new Student(4l, "Naveen", "Kumar", 27),
				new Student(5l, "Nandish", "Yadav", 28));

		System.out.println("Sort using ID : descending \n");
		students.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(System.out::println);

		System.out.println("\nSort using firstName : ascending\n");
		students.stream().sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);

		System.out.println("\n Sort using lastName : descending\n");
		students.stream().sorted(Comparator.comparing(Student::getLastName).reversed()).forEach(System.out::println);
	
	
		System.out.println("\n Sort using age : ascending");
		students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
	}

}
