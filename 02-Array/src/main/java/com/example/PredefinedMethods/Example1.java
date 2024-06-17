package com.example.PredefinedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 22, 13, 4, 35 };
		int[] arr2 = new int[5];

		// 1. Arrays fill
		Arrays.fill(arr2, 0);
		for (int a : arr1) {
			System.out.print(a + " ");
		}
		System.out.println("\n----------");
		for (int a : arr2) {
			System.out.print(a + " ");
		}

		// 2. Array sort
		Arrays.sort(arr1);
		System.out.println("\n----------");
		for (int a : arr1) {
			System.out.print(a + " ");
		}

		// 3.Parallel sort
		Arrays.parallelSort(arr1);
		System.out.println("\n----------");
		for (int a : arr1) {
			System.out.print(a + " ");
		}
		
		// 4.asList
		List<Integer> asList = Arrays.asList(1,3,4,5);

		System.out.println(asList);
	}

}
