package com.example._Array;

import java.util.Arrays;

public class Assignment_01 {

	public static int[] initializeValue(int[] initial, int[] arr, int k) {
		int i = k;
		while (i < initial.length) {
			initial[i] = initial[i] + 1;
			if (Arrays.equals(initial, arr))
				break;
			i++;
		}
		return initial;
	}

	public static int functionCheck(int[] arr) {
		int[] initial = new int[arr.length];
		int k = 0;
		while (! Arrays.equals(initial, arr)) {
			initializeValue(initial, arr, k);
			k++;
		}
		return k;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };

		int result = functionCheck(arr);
		System.out.println(result);

	}

}
