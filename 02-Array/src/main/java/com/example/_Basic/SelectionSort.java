package com.example._Basic;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[i];
//			arr[i] = temp;
			int key = arr[min];
			while (min > i) {
				arr[min] = arr[min - 1];
				min--;
			}
			arr[i] = key;
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 50, 70, 3, 2, 1 };
		selectionSort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
