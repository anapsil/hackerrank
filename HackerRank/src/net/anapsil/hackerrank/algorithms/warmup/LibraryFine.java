package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] actualReturn = new int[3];
		int[] expectedReturn = new int[3];
		
		for (int i = 0; i < 3; i++) {
			actualReturn[i] = in.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			expectedReturn[i] = in.nextInt();
		}
		
		if (actualReturn[2] > expectedReturn[2]) {
			System.out.println((actualReturn[2]-expectedReturn[2]) * 10000);
		} else if (actualReturn[1] > expectedReturn[1] && actualReturn[2] == expectedReturn[2]) {
			System.out.println((actualReturn[1]-expectedReturn[1]) * 500);
		} else if (actualReturn[0] > expectedReturn[0] && actualReturn[1] == expectedReturn[1] && actualReturn[2] == expectedReturn[2]){
			System.out.println((actualReturn[0]-expectedReturn[0]) * 15);
		} else {
			System.out.println(0);
		}
	}

}
