package com.binarytree.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomExceptionTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		System.out.println(map);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " :: " + m.getValue());
		}

		int [] numbers = new int[1];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 2;
	}

}
