package net.anapsil.hackerrank.algorithms;

import java.util.Scanner;

public class SoveMeFirst {
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum = sum(a,b);
		
		System.out.println(sum);
	}

}
