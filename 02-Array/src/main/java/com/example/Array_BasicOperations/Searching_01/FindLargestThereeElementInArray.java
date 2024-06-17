package com.example.Array_BasicOperations.Searching_01;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestThereeElementInArray {
	
	static Integer[] findLargestThreeElementsInArray(Integer[] arr) {
		if(arr.length>2) {
			Integer[] result = new Integer[3];
			int l = arr.length;
			Arrays.sort(arr);
			result[0] = arr[l-1];
			result[1] = arr[l-2];
			result[2] = arr[l-3];
			return result;
		}
		else {
			Arrays.sort(arr, Collections.reverseOrder());
			return Arrays.copyOf(arr, 3);
		}
	}
	
	public static void main(String[] args) {
		
//		Integer[] numbers = {10,7,20,55,76,83,97,11,53,27,13,93,15};
		Integer[] numbers = {20,35};
		
		Integer[] resultArray = findLargestThreeElementsInArray(numbers);
		
		System.out.println(Arrays.asList(resultArray));
		
	}

}
