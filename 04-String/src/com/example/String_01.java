package com.example;

class Hardware {
	String hardwareName;
	String hardwarePrice;

	Hardware() {

	}

	Hardware(String name, String price) {
		this.hardwareName = name;
		this.hardwarePrice = price;
	}

	public void display() {
		System.out.println("Inside Hardware");
		System.out.println(this.hardwareName + " :: " + this.hardwarePrice);
	}
}

class Pendrive extends Hardware {
	Pendrive(String name, String price) {
		this.modelName = name;
		this.modelPrice = price;
	}

	String modelName;
	String modelPrice;

	public void display() {
		System.out.println("Inside Pendrive");
		System.out.println(this.modelName + " :: " + this.modelPrice);
	}
}

public class String_01 {

	public static void main(String[] args) {
		Hardware obj1 = new Pendrive("Mike","1500");
		obj1.display();
	}

}
