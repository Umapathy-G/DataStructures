package com.example.ArrayEasyProblems;

public class MaxMinInArray {

	public static void main(String[] args) {

		int[] numbers = {22, 14, 8, 17, 35, 3};
		int min = numbers[0];
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
			else
				max = numbers[i];
		}
		System.out.println("Min  :: " + min);
		System.out.print("Max  :: " + max);
	}
}
