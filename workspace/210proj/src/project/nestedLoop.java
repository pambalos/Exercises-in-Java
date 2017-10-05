package project;

import java.util.Scanner;

public class nestedLoop {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Input one number: ");

		int row = 1;
		int col = 1;
		int z = enter.nextInt();

		while (row < z + 1) {
			col = 1;
			while (col < z + 1) {
				int product = row * col;
				System.out.print(product + " ");
				col++;
			}
			row++;
			System.out.print("\n");
		}
	}
}
