package com.example.BasicExamples;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargestElement {

	public static void findSecondLargerstElement(int[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Second Largest Element :: ");
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 7, 8, 9, 52, 100, 15, 251, 75, 97 };
		findSecondLargerstElement(numbers);
	}

}
