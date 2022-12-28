package org.test;

import java.util.Scanner;

public class QuestionSeven {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("fibonacci series");

		int a = 0;
		int b = 1;
		s = new Scanner(System.in);

		int count = s.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println(a);

			int c = a + b;
			a = b;
			b = c;

		}

	}

}
