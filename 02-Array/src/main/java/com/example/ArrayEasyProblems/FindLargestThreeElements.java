package com.example.ArrayEasyProblems;

import java.util.Arrays;

public class FindLargestThreeElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j > arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
