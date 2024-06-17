package com.binarytree.Test;

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.right = this.left = null;
	}

}

public class BinaryTree {

	Node root = null;

	void insert(int data) {
		insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			return root = new Node(data);
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	Integer search(int key) {
		root = searchKey(root, key);
		if (root != null) {
			return root.data;
		}
		return null;
	}

	private Node searchKey(Node root, int key) {
		if (root == null || root.data == key) {
			return root;
		}

		if (key > root.data) {
			return searchKey(root.right, key);
		}

		return searchKey(root.left, key);
	}

}
