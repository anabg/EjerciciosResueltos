package com.codeforces;

import java.util.Scanner;



public class _01Watermelon {
	
	
	
	public static String isEvenWeight(int weight) {
		
		String result = "NO";
		if((weight % 2) == 0) {
			result = "YES";
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();

		System.out.println(_01Watermelon.isEvenWeight(w));
		//_01Watermelon.isEvenWeight(w);
	}
}
