package com.example.stack;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>(3);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(60);
		System.out.println(s.pop());
		System.out.println(s.pop());
//		System.out.println(s.pop());
		s.push(40);
		System.out.println(s.peek());
		s.display();
		System.out.println(s.size());
	}

}
