package org.Programs;

public class AdditionOfNumberInString {
	public static void main(String[] args) {

		String str1 = "dhj34dfhf9fs";


		char[] c = str1.toCharArray();

		int sum = 0;

		for (int i = 0; i < c.length; i++) {

			if (Character.isDigit(c[i])) {


				int a = Integer.parseInt(String.valueOf(c[i]));

				sum = sum + a;

			}

		}
		System.out.println("Sum of Digits is : " + sum);

	}

}

