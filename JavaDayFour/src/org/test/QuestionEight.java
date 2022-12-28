package org.test;

import java.util.Scanner;

public class QuestionEight {
	private static Scanner s;

	public static void main(String[] args) {

		System.out.println("checking the prime number");
		s = new Scanner(System.in);

		int n = s.nextInt();

		int count = 0;

		if (n <= 1) {
			System.out.println("the number is not prime");
			return;
		}
		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("the number is not prime");
		} else {
			System.out.println("the number is prime");
		}
	}

}
