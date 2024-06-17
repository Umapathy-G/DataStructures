package com.example.opps;

class Animal{
	
}

class Lion extends Animal{
	
}

class Tiger extends Animal{
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Tiger obj = new Tiger();
		
		if(obj instanceof Animal) {
			System.out.println("Animal Object");
		}
		else if(obj instanceof Tiger) {
			System.out.println("Tiger Object");
		}
		
	}
	
}
