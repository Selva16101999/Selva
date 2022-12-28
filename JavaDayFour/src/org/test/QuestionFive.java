package org.test;

import java.util.Scanner;

public class QuestionFive {
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("find the count");
		s = new Scanner(System.in);

		int j = s.nextInt();
		int n = 0;

		for (int i = 1; i <= j; i++) {
			if (i % 2 == 0) {
				n++;

			}
		}
		System.out.println(n);

	}

}
