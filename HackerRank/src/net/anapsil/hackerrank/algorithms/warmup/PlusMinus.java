package net.anapsil.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		int size;
		double positives = 0;
		double negatives = 0;
		double zeros = 0;
		
		Scanner in = new Scanner(System.in);
		
		size = in.nextInt();
		
		for (int i = 0; i < size;i++) {
			if (in.hasNext()) {
				int value = in.nextInt();
				
				if (value == 0) {
					zeros++;
				} else if (value < 0) {
					negatives++;
				} else {
					positives++;
				}
			}
		}
		
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.println(df.format(positives/size));
		System.out.println(df.format(negatives/size));
		System.out.println(df.format(zeros/size));
	}
}
