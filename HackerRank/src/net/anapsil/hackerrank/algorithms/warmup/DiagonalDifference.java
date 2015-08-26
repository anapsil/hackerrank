package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int matrix[][] = new int[size][size];
		int firstDiagonal = 0;
		int secondDiagonal = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (in.hasNext()) {
					matrix[i][j] = in.nextInt();
				}
			}
		}

		for (int i = 0; i < size; i++) {
			firstDiagonal += matrix[i][i];
			secondDiagonal += matrix[i][size - 1 - i];
		}

		System.out.println(Math.abs((firstDiagonal - secondDiagonal)));

	}

}
