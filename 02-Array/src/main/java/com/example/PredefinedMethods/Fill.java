package com.example.PredefinedMethods;

import java.util.Arrays;

public class Fill {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = 0;
		}
		
		for(int num: arr1) {
			System.out.print(num);
		}
		
		Arrays.fill(arr1, 1);
		
		for(int num: arr1) {
			System.out.print(num);
		}
	}
}
