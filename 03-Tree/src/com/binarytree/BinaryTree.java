package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;

	BinaryNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {

	BinaryNode root;

	BinaryTree() {
		root = null;
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private BinaryNode insertRec(BinaryNode root, int data) {
		if (root == null) {
			root = new BinaryNode(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(BinaryNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(BinaryNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(BinaryNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}

	public void levelOrderTraversal() {
		if (root == null) {
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			BinaryNode current = queue.poll();
			System.out.print(current.data + " ");

			if (current.left != null) {
				queue.offer(current.left);
			}
			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}

	public void delete(int data) {
		delete(root, data);
	}

	private BinaryNode delete(BinaryNode root, int key) {
		if (root == null) {
			return root;
		}

		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.data = min(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}

	private int min(BinaryNode root) {
		int small = root.data;
		while (root.left != null) {
			small = root.left.data;
			root = root.left;
		}
		return small;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.insert(50);
		tree.insert(20);
		tree.insert(70);
		tree.insert(10);
		tree.insert(25);
		tree.insert(60);
		tree.insert(90);
		tree.insert(80);
		tree.insert(75);

//        tree.insert(1);
//        tree.insert(0);

		System.out.println("Pre-order traversal of the binary tree:");
		tree.preOrderTraversal();
		System.out.println();
		System.out.println();

		System.out.println("In-order traversal of the binary tree:");
		tree.inOrderTraversal();
		System.out.println();
		System.out.println();

		System.out.println("Postorder traversal of the binary tree:");
		tree.postOrderTraversal();
		System.out.println();
		System.out.println();

		System.out.println("Level-order traversal of the binary tree:");
		tree.levelOrderTraversal();
		System.out.println();

		System.out.println();
		tree.delete(70);
		System.out.println("In-order traversal of the binary tree:");
		tree.inOrderTraversal();
		System.out.println();

	}

}
