package com.example.linkedlist;

import java.util.Stack;

class Node {

	int data;
	Node right;

	Node(int value) {
		this.data = value;
		this.right = null;
	}

}

public class CustomLinkedList {

	Node head = null;

	public void add(int value) {
		Node node = new Node(value);

		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = node;
		}

	}
	
	public boolean palindromeCheck(Node head) {
		boolean isPalindrome = true;
		Stack<Integer> stack = new Stack<>();
		Node temp = head;
		Node root = head;
		while(temp != null) {
			stack.push(temp.data);
			temp = temp.right;
		}
		while(root != null) {
			if(root.data != stack.pop())
				isPalindrome = false;			
			root = root.right;
		}
		return isPalindrome;
	}

	public void display(Node root) {
		Node node = root;
		if (node == null)
			System.out.println("Linked List is Empty");

		System.out.println();
		while (node != null) {
			System.out.print(node.data + " " );
			node = node.right;
		}
	}
	
	public Node swapNodes(Node head, int x, int y)
    {
		Node currX = head;
		Node currY = head;
		Node prevX; 
		Node prevY; 
		
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.right;
		}
		
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.right;
		}
		
        return head;
    }

	public static void main(String[] args) {

		CustomLinkedList li = new CustomLinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.display(li.head);
//		boolean palindromeCheck = li.palindromeCheck(li.head);
//		System.out.println("\nPalindrome :: " + palindromeCheck);
		Node swap = li.swapNodes(li.head,20, 40);
		li.display(swap);
//		li.display(li.head);
	}

}
