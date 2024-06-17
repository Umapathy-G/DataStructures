package com.example.main;

public class Test {

	public static void main(String[] args) {

		String s = "06:01:00AM";

		String val = Character.toString(s.charAt(0)) + Character.toString(s.charAt(1));
		int num = Integer.valueOf(val);

		if (s.charAt(8) == 'P') {
			if (num == 12) {
				System.out.print("12");
				System.out.print(s.substring(2, 8));
				return;
			}

			num += 12;

			String tf = (num == 24) ? "00" : Integer.toString(num);
			String fv = tf + s.substring(2, 8);
			System.out.println(fv);
		} else {
			if (num == 12) {
				System.out.print("00");
				System.out.print(s.substring(2, 8));
			} else {
				System.out.println(s.substring(0, 8));
			}
		}
	}

}
