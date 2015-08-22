package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int sum = 0;
		
		while (in.hasNext()) {
			sum += in.nextInt();
		}
		
		System.out.println(sum);
	}

}
