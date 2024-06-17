package com.example.SearchingArrays;

public class IterativeBinarySearch {

	public static Integer iterativeBinarySearch(Integer[] arr, int key, int f, int l) {

		while (l >= f) {
			int mid = f + (l - f) / 2;

			if (key == arr[mid]) {
				return mid;
			}

			if (key < arr[mid]) {
				l = mid - 1;
			} else {
				f = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int key = 13;
		Integer[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int f = 0;
		int l = arr.length - 1;
		Integer indexOf = iterativeBinarySearch(arr, key, f, l);

		if (indexOf != -1) {
			System.out.println(key + " found at :: " + indexOf);
		} else {
			System.out.println(key + " is not available");
		}
	}

}
