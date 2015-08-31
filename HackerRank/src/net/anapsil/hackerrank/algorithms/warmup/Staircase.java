package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		
		String[][] matrix = new String[height][height];
		
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				if (i >= (height-1-j)) {
					matrix[i][j] = "#";
				} else {
					matrix[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				if (j < height-1) {
				System.out.print(matrix[i][j]);
				} else {
					System.out.println(matrix[i][j]);
				}
			}
		}
	}

}
