package com.example.main;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {

	Node head;

	void push(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}

	void insertAtMid(int x) {
		if (head == null)
			head = new Node(x);
		else {
			Node newNode = new Node(x);

			Node ptr = head;
			int len = 0;

			while (ptr != null) {
				len++;
				ptr = ptr.next;
			}

			int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
			ptr = head;

			while (count-- > 1)
				ptr = ptr.next;

			newNode.next = ptr.next;
			ptr.next = newNode;
		}
	}

	void append(int data) {
		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			return;
		}

		Node last = head;

		while (last.next != null) {
			last = last.next;
		}

		last.next = newnode;
	}

	void deleteNode(int key) {

		Node first = head;
		Node second = head;

		for (int i = 0; i < key; i++) {
			if (second.next == null) {
				if (i == key - 1)
					head = head.next;
				return;
			}
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;
	}

	void printAll() {
		Node node = head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}

public class Main {

	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.push(5);
		ls.push(8);
		ls.push(3);
		ls.push(4);
		ls.push(1);
		ls.deleteNode(5);
		ls.insertAtMid(97);
		// ls.append(7);

		// ls1.insertAfter(ls, 2);
		ls.printAll();
	}

}
