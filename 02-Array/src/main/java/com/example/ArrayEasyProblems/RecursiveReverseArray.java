package com.example.ArrayEasyProblems;

import java.util.Arrays;

public class RecursiveReverseArray {

	public static void reverseArray(int[] arr, int start, int end) {
		int temp;

		if (start >= end) {
			return;
		}

		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		reverseArray(arr, start + 1, end - 1);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = arr.length - 1;
		reverseArray(arr, start, end);

		System.out.println(Arrays.toString(arr));
	}

}
