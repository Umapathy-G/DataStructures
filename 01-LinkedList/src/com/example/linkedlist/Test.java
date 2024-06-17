package com.example.linkedlist;

class Call {
	
	Call(){
		System.out.println("Call");
	}
	public int num1 = 5;
	
	public void getCall() {
		System.out.println("Inside Call");
	}
	
}

public class Test extends Call{

	Test(){
		super.num1 = 15;
		System.out.println("Test");
		System.out.println(super.num1);
	}
	
	public void getCall() {
		System.out.println("Inside Test");
	}
	
	public static void main(String[] args) {
		Call t = new Test();
		t.getCall();
	}
	
}
