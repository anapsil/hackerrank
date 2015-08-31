package net.anapsil.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int value = in.nextInt();
		BigInteger result = BigInteger.ONE;
		
		for (int v = value; v > 0; v--) {
			result = result.multiply(BigInteger.valueOf(v));
		}
		
		System.out.println(result);
	}

}
