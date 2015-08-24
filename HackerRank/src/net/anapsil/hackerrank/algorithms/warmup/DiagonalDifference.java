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
			if (in.hasNext()) {
				matrix[0][i] = in.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			if (in.hasNext()) {
				matrix[1][i] = in.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			if (in.hasNext()) {
				matrix[2][i] = in.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			firstDiagonal += matrix[i][i];
		}
		
		for (int i = size-1; i == 0; i--) {
			secondDiagonal += matrix[i][i];
		}
		System.out.println(firstDiagonal - secondDiagonal);

	}

}
