package com.example.queue;

import java.util.Arrays;

public class Queue {

	int[] queue;
	int front;
	int rear;
	int size;

	public Queue(int size) {
		this.size = size;
		queue = new int[size];
		rear = front = 0;
	}

	public void enqueue(int data) {
		if (rear == size) {
			System.out.println("Queue is Full, can't enqueue data :: " + data);
			return;
		}
		queue[rear] = data;
		rear++;
	}

	public int dequeue() {
		if (front == rear) {
			System.out.println("Queue is Empty");
			return -1;
		}
		rear--;
		int result = queue[front];
		int[] newQueue = Arrays.copyOfRange(queue, front + 1, rear + 1);
		queue = newQueue;
		return result;
	}

	public int peek() {
		if (front == rear) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[front];
	}

	public void display() {
		System.out.println();
		for (int num : queue) {
			System.out.print(num + " ");
		}
	}

}
