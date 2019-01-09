package com.codeforces;

import java.util.Scanner;

/**
 * Created by Belu on 13/2/2018.
 *
 * Capitalization is writing a word with its first letter as a capital letter.
 * Your task is to capitalize the given word.
 *
 * Note, that during capitalization all the letters except the first one remains unchanged.
 *
 * Input
 *
 * A single line contains a non-empty word. This word consists of lowercase and uppercase English letters.
 * The length of the word will not exceed 103.
 *
 *
 * Output
 *
 * Output the given word after capitalization.
 *
 * Examples
 *
 * input
 * ApPLe
 *
 * output
 * ApPLe
 *
 * input
 * konjac
 *
 * output
 * Konjac
 */
public class _14WordCapitalization {

    public static String getOutputString(String inWord) {


        return inWord.substring(0,1).toUpperCase().concat(inWord.substring(1,inWord.length()));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.next();

        System.out.println(getOutputString(word));


    }
}
