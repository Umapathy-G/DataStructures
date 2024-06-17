package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Employee[] emp_arr = { new Employee(1, "Raja", "raja@gmail.com", 35),
				new Employee(2, "Vijay", "viay@gmail.com", 25), new Employee(3, "Kumar", "kumar@gmail.com", 40),
				new Employee(4, "Kishore", "kishore@gmail.com", 40) };

		List<Employee> asList = Arrays.asList(emp_arr);

		// 1. Employee's whose name starts with K
		List<Employee> collect = asList.stream().filter(n -> n.getName().toUpperCase().startsWith("K"))
				.collect(Collectors.toList());

		System.out.println(collect);

		// 2. Get Employee's name in a separate list
		List<String> collect2 = asList.stream().map(n -> n.getName()).collect(Collectors.toList());

		System.out.println(collect2);

		String[] array = collect2.toArray(new String[0]);
		Employee[] array2 = asList.toArray(new Employee[0]);

		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (Employee s : array2) {
			System.out.print(s + " ");
		}
	}

}
