package com.basics.linkedlist;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.insertAfter(20,25);
		li.insertAfter(30,35);
		List<Integer> display = li.display();
		System.out.println(display);
	}
}
