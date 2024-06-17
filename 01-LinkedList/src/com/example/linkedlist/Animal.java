package com.example.linkedlist;

public class Animal {

	public int id;
	public String name;
	public String locatedIn;

	public void display() {
		System.out.println("Animal ---> " + this.id + " :: " + this.name + " :: " + this.locatedIn);
	}

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.id = 1;
		animal.name = "Lion";
		animal.locatedIn = "Jaipur";

		animal.display();
	}
}
