package com.example.demo.fi;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example implements Processor {

	@Override
	public void processorName() {
		System.out.println("Example Processor :: ");
	}

	public void check(Processor processor) {
		processor.processorName();
	}

	public static void main(String[] args) {
		Example e = new Example();
		e.processorName();

		Consumer<Employee> printName = (emp) -> System.out
				.println("Name = " + emp.getEmpName() + " ::  Age = " + emp.getEmpAge());

		printName.accept(new Employee("Umapathy", 25));

		e.check(() -> System.out.println("Lambda Processor :: "));

		Processor p = () -> System.out.println("Intel i5 ");
		p.processorName();

		Mobile mob = (name, sno) -> {
			if (name != null)
				return true;
			else
				return false;
		};

		boolean working = mob.isWorking(null, 1);
		System.out.println(working);

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.forEach(n -> System.out.println(n));
		
		Predicate<Integer> checkEligibility = age -> age>=18;
		boolean test = checkEligibility.test(20);
		System.out.println("Voting Eligibility :: " + test);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raja",25));
		employees.add(new Employee("Vimal",30));
		employees.add(new Employee("Balu",35));
		employees.add(new Employee("Smith",18));
		employees.add(new Employee("Karthik",12));
		
		numbers.stream().filter(n -> n!=5).forEach(n -> System.out.println(n));
		
		employees.stream().filter(emp -> emp.getEmpAge()<=20).map(emp->emp.getEmpName()).forEach(emp -> System.out.println(emp));
		
		OptionalInt sum = numbers.stream().mapToInt(Integer::intValue).max();
		System.out.println(sum);
	}
}
