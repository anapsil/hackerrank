package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		long sum = 0;
		
		while (in.hasNext()) {
			sum += in.nextLong();
		}
		
		System.out.println(sum);
	}

}
