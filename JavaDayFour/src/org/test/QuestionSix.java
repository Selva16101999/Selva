package org.test;

import java.util.Scanner;

public class QuestionSix {
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("find the factorial number");

		s = new Scanner(System.in);

		int j = s.nextInt();
		int fact = 1;

		for (int i = 1; i <= j; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
