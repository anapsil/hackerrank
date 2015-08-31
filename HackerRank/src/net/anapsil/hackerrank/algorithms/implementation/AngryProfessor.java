package net.anapsil.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tests = in.nextInt();

		int classStudents;
		int minimumStudents;

		for (int t = 1; t <= tests; t++) {
			classStudents = in.nextInt();
			minimumStudents = in.nextInt();
			int count = 0;

			for (int i = 0; i < classStudents; i++) {
				int arrival = in.nextInt();
				if (arrival <= 0) {
					count++;
				}
			}

			if (count >= minimumStudents) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
