package com.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {

	int id;
	String name;
	int age;

	public int compareTo(Person p) {
		return this.age - p.age;
	}

	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

class IdComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.id - o2.id;
	}

}

public class Main {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<>();

		personList.add(new Person(1, "Raja", 20));
		personList.add(new Person(2, "Kamal", 40));
		personList.add(new Person(3, "Vijay", 30));
		
		Person per1 = new Person(1, "Raja", 20);
		Person per2 = new Person(2, "Kamal", 40);
		
		per1.name = per2.name;

//	Comparator<Person> idComparator = (p1,p2)-> p1.age - p2.age;

		Collections.sort(personList, (p1, p2) -> p1.id - p2.id);
//		System.out.println(personList);
		System.out.println(per1);
		System.out.println(per2);
	}

}
