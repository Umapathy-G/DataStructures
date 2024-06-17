package com.test.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

	List<T> list;
	int top = -1;
	int size;

	Stack(int size) {
		this.size = size;
		this.list = new ArrayList<T>(size);
	}

	public void push(T data) {
		if (top == size - 1) {
			System.out.println("Stack Overflow, can't push :: " + data);
			return;
		}
		++top;
		this.list.add(data);
	}

	public T pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		return this.list.remove(top--);
	}

	public T peek() {
		if (top == -1) {
			System.out.println("Stack Empty");
			return null;
		}
		return this.list.get(top);
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public void display() {
		System.out.println(list);
	}

}
