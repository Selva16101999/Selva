package org.questionnine;

import java.util.Scanner;

public class Pattern3 {
	private static Scanner s;

	private static void main(String[] args) {
		System.out.println("Formation");

		s = new Scanner(System.in);

		int row = s.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
