package com.example.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getAge() - (o1.getAge());
	}
	
}

public class IComparator {

	public static void main(String[] args) {

		Employee[] emp_arr = { new Employee(1, "Raj", 25, "Chennai"), new Employee(2, "Vikram", 32, "Gujarat"),
				new Employee(3, "Kalai", 30, "Delhi"), new Employee(4, "Senthil", 22, "Salem"),
				new Employee(5, "Anand", 27, "Ooty"), };

		List<Employee> empList = Arrays.asList(emp_arr);

		System.out.println("Employees befor sorting : ");
		for (Employee employee : empList) {
			System.out.println(
					employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getCity());
		}

		Collections.sort(empList);
		Comparator<Employee> ageComparator = (e1,e2) -> e1.getAge() - e2.getAge();
		Collections.sort(empList,  ageComparator);

		System.out.println("Employees after sorting : "); 
		for (Employee employee : empList) {
			System.out.println(
					employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getCity());
		}
	}

}
