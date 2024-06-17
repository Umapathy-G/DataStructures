package com.example.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

	public static void method1(TestInterface t, String name) {
		t.printName(name);
	}

	public static void main(String[] args) {
		List<String> nameList1 = new ArrayList<>();
		nameList1.add("Ashok");
		nameList1.add("Ashok1");
		nameList1.add("Ashok2");
		
		List<String> nameList2 = new ArrayList<>();
		nameList1.add("Ashok");
		nameList1.add("Ashok1");
		nameList1.add("Ashok2");
		
		List<List<String>> nameList = new ArrayList<>();
		nameList.add(nameList1);
		nameList.add(nameList2);
		
		List<String> collect = nameList.stream().flatMap((n) -> n.stream()).collect(Collectors.toList());
		
		System.out.println(collect);
		
//		new Main().display();

//		TestInterface t = (n) -> System.out.println(n + " Welcome To FedEx");
//
//		t.printName("Umapathy G");

		method1(n -> System.out.println(n + " welcome to FedEx!!!"),"Umapathy G");
		
		BiConsumer<String,String> printName = (n,m) -> System.out.println(n + " :: " + m);
		printName.accept("Kamal","Vijay");
		
		Integer[] numbers = {10,1,1,5,7,6,25,40,3,2,1};
		List<Integer> numberList = Arrays.asList(numbers);
		
		List<Integer> collect2 = numberList.stream().sorted().collect(Collectors.toList());
		Object[] array = collect2.toArray();
		String[] copyOf = Arrays.copyOf(array, array.length,String[].class);
		
		for(String n : copyOf) {
			System.out.print(n + " ");
		}
	}

//	@Override
//	public void display() {
//		System.out.println("Test Interface Working!!!");
//	}

}
