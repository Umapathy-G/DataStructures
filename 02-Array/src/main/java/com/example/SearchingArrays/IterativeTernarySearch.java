package com.example.SearchingArrays;

public class IterativeTernarySearch {

	public static Integer iterativeTernarySearch(Integer[] arr, int key, int f, int l) {

		while (l >= f) {
			int mid1 = f + (l - f) / 3;
			int mid2 = l - (l - f) / 3;

			if (key == arr[mid1]) {
				return mid1;
			}
			if (key == arr[mid2]) {
				return mid2;
			}

			if (key < arr[mid1]) {
				l = mid1 - 1;
			} else if (key < arr[mid2]) {
				f = mid1 + 1;
				l = mid2 - 1;
			} else {
				f = mid2 + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int key = 15;
		Integer[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13 };
		int f = 0;
		int l = arr.length - 1;
		Integer indexOf = iterativeTernarySearch(arr, key, f, l);

		if (indexOf != -1) {
			System.out.println(key + " found at :: " + indexOf);
		} else {
			System.out.println(key + " is not available");
		}
	}

}
