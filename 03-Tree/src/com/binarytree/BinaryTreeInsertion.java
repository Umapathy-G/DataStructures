package com.binarytree;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTreeInsertion {

	Node root = null;

	void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	Integer search(int data) {
		root = searchKey(root, data);
		if (root != null) {
			return root.data;
		}
		return null;
	}

	public Node searchKey(Node root, int key) {
		if (root == null || root.data == key)
			return root;

		if (root.data < key)
			return searchKey(root.right, key);

		return searchKey(root.left, key);
	}

}
