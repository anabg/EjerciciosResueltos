package com.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03WayTooLongWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<String> wordsResultList = new ArrayList();

		int words = in.nextInt();

		for (int i = 0; i < words; i++) {

			String wordValue = in.next();

			if (wordValue.length() > 10) {
				wordValue = wordValue.substring(0, 1) + String.valueOf((wordValue.length() - 2))
						+ wordValue.substring(wordValue.length() - 1);
			}

			// System.out.println(wordValue);
			wordsResultList.add(wordValue);

		}

		for (String result : wordsResultList) {

			System.out.println(result);
		}
	}
}
