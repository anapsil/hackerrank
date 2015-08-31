package net.anapsil.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int quant = in.nextInt();
        int[] values = new int[quant];
		int dividers;
		int divisor;
		
		for (int i = 0; i < quant; i++) {
			values[i] = in.nextInt();
		}
		
		for (int i = 0; i < quant; i++) {
			String value = String.valueOf(values[i]);
			dividers = 0;
			for (int d = 0; d < value.length(); d++) {
				divisor = Character.getNumericValue((value.charAt(d)));
				if (divisor != 0 && values[i]%divisor == 0) {
					dividers++;
				}
			}
			
			System.out.println(dividers);
		}
	}

}
