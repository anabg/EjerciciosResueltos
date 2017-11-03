package com.codeforces;

import java.util.Scanner;

public class _01Watermelon {
	public static String isWeightEven(int weight) {

		String isEven = "NO";
		if ((weight % 2) == 0) {
			if (weight == 2)
				return "NO";
			isEven = "YES";
		}

		return isEven;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight = in.nextInt();

		System.out.println(_01Watermelon.isWeightEven(weight));

	}

}
