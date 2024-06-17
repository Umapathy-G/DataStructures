package com.example.main;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n=3;
		
		for(int i=0;i<n;i++) {
			int j,first;
			first = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
