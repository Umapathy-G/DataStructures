package com.example.stack;

import java.util.ArrayList;

public class Stack<T> {

	ArrayList<T> list;
	int top = -1;
	int size;

	public Stack(int size) {
		this.size = size;
		this.list = new ArrayList<T>(size);
	}

	// Inserts an element into the bottom
	public void push(T data) {
		if (top == size-1) {
			System.out.println("Stack is Full, can't push the data :: " + data);
			return;
		}
		top++;
		if(list.size()>top) {
			list.set(top, data);
		}
		list.add(data);
	}

	// Removes an element from the top
	public T pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return null;
		}
		return list.remove(top--);
	}

	// Gets the top element
	public T peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return null;
		}
		return list.get(top);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return list.size();
	}

	public void display() {
		System.out.println(list);
	}

}
