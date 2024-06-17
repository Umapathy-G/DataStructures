package com.example.demo.test;

import java.util.Scanner;

public class Sample {

	public static int searchElementInArray(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		int i = 0;
		while (numbers.length > i) {
			if (i == 0) {
				System.out.print("[");
			}
			if (i != numbers.length - 1)
				System.out.print(numbers[i++] + ", ");
			else
				System.out.print(numbers[i++] + "]");
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to be searched in Array : ");
		int x = sc.nextInt();
		int index = searchElementInArray(numbers, x);

		if (index != -1)
			System.out.println("Element Fount at index :: " + index);
		else
			System.out.println("Searched Element Doesn't Exists");
	}

}
