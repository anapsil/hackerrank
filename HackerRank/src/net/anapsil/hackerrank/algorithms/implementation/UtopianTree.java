package net.anapsil.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		int[] cycles = new int[testCases];
		
		for (int i = 0; i < testCases; i++) {
			cycles[i] = in.nextInt();
		}
		
		for (int i = 0; i < testCases; i++) {
			int height = 1;
			for (int c = 1; c <= cycles[i]; c++) {
				if (c%2 != 0) {
					height *= 2;
				} else {
					height++;
				}
			}
			System.out.println(height);
		}
	}
}
