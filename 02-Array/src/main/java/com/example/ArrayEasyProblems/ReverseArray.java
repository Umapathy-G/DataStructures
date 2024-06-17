package com.example.ArrayEasyProblems;

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr, int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 10 };

		int start = 0;
		int end = arr.length - 1;

		reverseArray(arr, start, end);
		System.out.println(Arrays.toString(arr));

	}

}
