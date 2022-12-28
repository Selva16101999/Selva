package org.test;

import java.util.Scanner;

public class QuestionEleven {
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Reverse");
		s = new Scanner(System.in);

		int num = s.nextInt();

		int reverse = 0;

		// run loop until number becomes 0
		while (num != 0) {

			// get last digit from number
			int digit = num % 10;
			reverse = reverse * 10 + digit;

			// remove the last digit from number
			num /= 10;

		}
		System.out.println(reverse);

	}

}
