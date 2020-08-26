package com.balu;


import java.util.Scanner;

public class Balu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");

		int rows = sc.nextInt();

		int a = 65;

		for (int i = 0; i <=rows; i++) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print((char) (a + j));
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int l = rows - i; l >= 0; l--) {
				if (l != rows)
					System.out.print((char) (a + l));
			}
			System.out.println();
		}
	}

}
