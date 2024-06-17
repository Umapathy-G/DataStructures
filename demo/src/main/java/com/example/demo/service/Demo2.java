package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().flatMap(number -> Stream.of(number*2));

	}
}
