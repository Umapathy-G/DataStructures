package com.basics.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	Node head;

	//Insertion at the end of Linked List
	public void push(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
	
	//Insertion at the end of Linked List
	public void add(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void insertAfter(int preValue, int value) {
		Node newNode = new Node(value);
		Node currNode = head;
		while(currNode.data!=preValue) {
			currNode = currNode.next;
		}

		newNode.next = currNode.next;
		currNode.next = newNode;

	}
	
	public List<Integer> display() {
		List<Integer> list = new ArrayList<>();
		Node node = head;
		while(node!=null) {
			list.add(node.data);
			node = node.next;
		}
		return list;
	}

}
