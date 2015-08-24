package net.anapsil.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int quant = in.nextInt();
        String[] values = new String[30];
		int dividers;
		
		for (int i = 0;i< quant;i++) {
			if (in.hasNext()) {
				values[i] = in.next();
			}
		}
		
		for (String v: values) {
			dividers = 0;
			for (int i = 0; i < v.length(); i++) {
				int div = (int) v.charAt(i);
				
				if (div != 0 && Integer.parseInt(v)%div == 0) {
					dividers++;
				}
			}
			System.out.println(dividers);
		}
	}

}
