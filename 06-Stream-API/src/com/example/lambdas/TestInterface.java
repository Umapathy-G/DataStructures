package com.example.lambdas;

@FunctionalInterface
public interface TestInterface {
	
	void printName(String name);
	
	default void test() {
		System.out.println("Test method");
	}
	
}
