package com.rndayala.corejava.basics.loops;

public class alphabetsUsingLoop {

	public static void main(String[] args) {
		// System.out.println("Displaying Alphabets using loops..");

		int n = 7;

		// for printing alphabets A, B, C, D
		for (int i = 0; i < n; i++) {

			// print alphabet A
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1) {
					if ((i == 0 && j == 0) || (i == 0 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet B
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1 || i == n - 1) {
					if ((i == n - 1 && j == n - 1) || (i == 0 && j == n - 1) || (i == (n - 1) / 2 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet C
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1) {
					if ((i == 0 && j == 0) || (i == n - 1 && j == 0))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet D
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
					if ((i == n - 1 && j == n - 1) || (i == 0 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			System.out.println();

		} // outer for loop

		System.out.println("\n");

		// for printing alphabets E, F, G, H
		for (int i = 0; i < n; i++) {

			// print alphabet E
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) / 2 || j == 0 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet F
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) / 2 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet G
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || (i > (n - 1) / 2 && j == n - 1) || (i == (n - 1) / 2 && j > 2)) {
					if ((i == 0 && j == 0) || (i == n - 1 && j == 0) || (i == n - 1 && j == n - 1)
							|| (i == (n - 1) / 2 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet H
			for (int j = 0; j < n; j++) {
				if (i == (n - 1) / 2 || j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			System.out.println();

		} // outer for loop

		System.out.println("\n");

		// for printing alphabets I, J, L, O
		for (int i = 0; i < n; i++) {

			// print alphabet I
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet J
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 || i == n - 1) {
					if ((i == (n - 1) && j >= (n - 1) / 2)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet L
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1) {
					if ((i == 0 && j > 0)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet O
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					if ((i == 0 && j == 0) || (i == n - 1 && j == 0) || (i == n - 1 && j == n - 1)
							|| (i == 0 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			System.out.println();

		} // outer for loop

		System.out.println("\n");

		// for printing alphabets P, S, T, U
		for (int i = 0; i < n; i++) {

			// print alphabet P
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1) {
					if ((i > (n - 1) / 2 && j == n - 1) || (i == 0 && j == n - 1) || (i == (n - 1) / 2 && j == n - 1))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet S
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || (i > (n - 1) / 2 && j == n - 1) || (i == (n - 1) / 2)) {
					if ((i == 0 && j == 0) || (i == n - 1 && j == n - 1 || (i== (n-1)/2 && j == 0))
							|| (i == (n - 1) / 2 && j == n - 1) || ((i> (n-1)/2 && i < (n-1)) && ( j == 0)) )
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet T
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			// print alphabet U
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					if ((i == n - 1 && j == 0) || (i == n - 1 && j == n - 1) || (i == 0 && (j > 0 && j < (n - 1))))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("     ");

			System.out.println();

		} // outer for loop

		System.out.println("\n");

		// print alphabet T
		/*
		 * for (int j = 0; j < n; j++) { if (i == 0 || j == (n - 1) / 2) {
		 * System.out.print("*"); } else { System.out.print(" "); } }
		 */

	}

}
