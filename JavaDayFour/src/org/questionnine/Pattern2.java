package org.questionnine;

import java.util.Scanner;

public class Pattern2 {
	private static Scanner s;

	public static void main(String[] args) {

		System.out.println("Pyramid");
		s = new Scanner(System.in);
		int row = s.nextInt();

		int space = row - 1;
		int star = 1;

		// Iteration for the rows
		for (int i = 0; i < row; i++) {

			// Iteration for the space
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			// Iteration for the star
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			star += 2;
			space--;
			System.out.println();
		}
	}

}