package org.questionnine;

import java.util.Scanner;

public class Pattern1 {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Formation");

		s = new Scanner(System.in);
		int row = s.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();

		}
	}
}
