package com.example.SearchingArrays;

public class RecursiveBinarySearch {

	public static int recursiveBinarySearch(int[] arr, int key, int f, int l) {

		while (l >= f) {
			int mid = f + (l - f) / 2;

			if (key == arr[mid]) {
				return mid;
			}

			if (key < arr[mid]) {
				return recursiveBinarySearch(arr, key, f, mid - 1);
			} else {
				return recursiveBinarySearch(arr, key, mid + 1, l);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int key = 99;
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 99 };
		int f = 0;
		int l = arr.length - 1;
		int indexOf = recursiveBinarySearch(arr, key, f, l);

		if (indexOf != -1) {
			System.out.println(key + " found at :: " + indexOf);
		} else {
			System.out.println(key + " is not available");
		}
	}

}
