package org.test;

import java.util.Scanner;

public class QuestionTwo {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("check the number");
		int e = s.nextInt();

		if (e % 2 == 0) {
			System.out.println("it is an even number");
		} else {
			System.out.println("it is an odd number");
		}

		int o = s.nextInt();

		if (o % 2 != 0) {
			System.out.println("it is an odd number");
		} else {
			System.out.println("it is an even number");
		}
	}

}
