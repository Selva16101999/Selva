package org.test;

import java.util.Scanner;

public class QuestionTen {
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("checking");
		s = new Scanner(System.in);

		int num = s.nextInt();

		int temp = num;
		int p = 0;

		while (num > 0) {
			int rem = num % 10;
			p = (p) + (rem * rem * rem);
			num = num / 10;
		}
		if (temp == p) {
			System.out.println("it is armstrong no");
		} else {
			System.out.println("it is not armstrong no");
		}

	}

}
