package net.anapsil.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String time = in.nextLine();
		int hour = Integer.parseInt(time.substring(0,2));
		
		if (hour < 12 && time.endsWith("PM")) {
			hour += 12;
		} else if (hour == 12 && time.endsWith("AM")) {
			hour = 0;
		}
		
		StringBuilder convertedTime = new StringBuilder();
		if (hour < 10) {
		convertedTime.append("0");
		}
		convertedTime.append(hour).append(time.substring(2,8));
		
		System.out.println(convertedTime);
	}

}
