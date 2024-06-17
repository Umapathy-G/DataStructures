package com.example.main;

public class ArrayFrequency {

	public enum SEASON {
		WINTER, SUMMER, SPRING, AUTUMN
	};

	public static void main(String[] args) {
		
		for(SEASON s: SEASON.values()) {
			System.out.println(s);
		}

		int[] arr = { 1, 2, 1, 2, 1 };
		int visitedarr[] = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visitedarr[j] = visited;
				}
			}
			if (visitedarr[i] != visited) {
				visitedarr[i] = count;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (visitedarr[i] != visited) {
				System.out.println(arr[i] + " : " + visitedarr[i]);
			}
		}

	}

}
