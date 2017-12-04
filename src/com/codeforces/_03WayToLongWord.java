package com.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.
 * <p>
 * Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.
 * <p>
 * This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.
 * <p>
 * Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".
 * <p>
 * You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.
 * <p>
 * Input
 * The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
 * <p>
 * Output
 * Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
 * <p>
 * Examples
 */
public class _03WayToLongWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> wordsList = new ArrayList();
        List<String> wordsResultList = new ArrayList();

        int words = in.nextInt();

        for (int i = 0; i < words; i++) {

            String wordValue = in.next();
            // System.out.println(wordValue);
            // wordsList.add(wordValue);
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