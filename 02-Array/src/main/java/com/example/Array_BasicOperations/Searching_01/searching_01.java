package com.example.Array_BasicOperations.Searching_01;

import java.util.Arrays;

public class searching_01 {

	public static int searchInArray(Integer[] arr1, Integer key) {
		// To find a value in a particular array
		int searchIndex = -1;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == key) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;

	}

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4, 5 };

		int searchInArray = searchInArray(arr1, 1);

		if (searchInArray >=0 && searchInArray < arr1.length) {
			System.out.println("Element is at index :: " + searchInArray);
		} else {
			System.out.println("Element Not Found!!!");
		}
		
		int binarySearch = Arrays.binarySearch(arr1, 13);
		System.out.println(binarySearch);

	}

}
