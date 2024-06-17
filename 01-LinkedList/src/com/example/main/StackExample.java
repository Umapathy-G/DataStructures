package com.example.main;

public class StackExample {
	public static void main(String[] args) {
		StackImpl s = new StackImpl(5);
		s.push(5);
		s.push(10);
		s.display();
	}
}

class StackImpl {

	int[] arr;
	int top = -1;
	int size;

	StackImpl(int size) {
		this.size = size;
		arr = new int[size];
	}

	boolean push(int a) {
		if (top >= size - 1) {
			return false;
		}
		arr[++top] = a;
		return true;
	}

	int pop() {
		if (top < 0) {
			return 0;
		}
		return arr[top--];
	}

	int peek() {
		if (top < 0) {
			return 0;
		}
		return arr[top];
	}

	boolean isEmpty() {
		return (top < 0);
	}

	void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
