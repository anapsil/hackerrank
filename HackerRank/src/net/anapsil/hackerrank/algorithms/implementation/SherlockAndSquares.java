package net.anapsil.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		int[][] values = new int[testCases][2];
		int squareNumbers;
		
		for (int i = 0; i < testCases; i++) {
			for (int j = 0; j < 2; j++) {
				values[i][j] = in.nextInt();
			}
		}
		
		//TODO refactor(timeout)
		for (int i = 0; i < testCases; i++) {
			squareNumbers = 0;
			for(int n = values[i][0]; n <=values[i][1]; n++) {
				int test = (int) Math.sqrt(n);
				if (test * test == n) {
					squareNumbers++;
				}
			}
			System.out.println(squareNumbers);
		}
	}

}
