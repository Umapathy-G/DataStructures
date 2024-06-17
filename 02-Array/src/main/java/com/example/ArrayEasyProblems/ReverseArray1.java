package com.example.ArrayEasyProblems;

public class ReverseArray1 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
//		int[] result = new int[numbers.length];

//		for (int n : numbers)
//		System.out.print(n + " ");
//
//		System.out.println();
//
//		for (int i = numbers.length - 1; i >= 0; i--) {
//			System.out.print(numbers[i] + " ");
//		}

//		for (int i = 0; i < numbers.length; i++) {
//			result[i] = numbers[numbers.length-i-1];
//		}
//		
//		for (int n : result)
//		System.out.print(n + " ");
		int start = 0;
		int end = numbers.length-1;
		
		while(start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
		
		for (int n : numbers)
		System.out.print(n + " ");
	}
}
