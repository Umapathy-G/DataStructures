package com.example._Basic;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		bubbleSort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
