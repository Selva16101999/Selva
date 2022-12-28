package org.test;

import java.util.Scanner;

public class QuestionOne {
	private static Scanner s ;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("vote eligibility");
		int i = s.nextInt();

		if (i >= 18 && i <= 60) {

			System.out.println("eligible to vote");

		} else {
			System.out.println("not eligible to vote");
		}
	}

}
