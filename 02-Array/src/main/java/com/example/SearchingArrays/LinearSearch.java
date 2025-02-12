package com.example.SearchingArrays;

public class LinearSearch {

	public static Integer linearSearch(Integer[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int key = 1;
		Integer[] arr = { 0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer indexOf = linearSearch(arr, key);
		
		if(indexOf != -1) {
			System.out.println(key + " found at :: " + indexOf);
		}
		else {
			System.out.println(key + " is not available");
		}
	}

}
