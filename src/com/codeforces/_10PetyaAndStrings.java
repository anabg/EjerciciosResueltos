package com.codeforces;

import java.util.Scanner;

/**
 * PETYA AND STRINGS
 * <p/>
 * Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and
 * lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an
 * uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.
 * <p/>
 * Input
 * Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are
 * of the same length and also consist of uppercase and lowercase Latin letters.
 * <p/>
 * Output
 * If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print
 * "0". Note that the letters' case is not taken into consideration when the strings are compared.
 * <p/>
 * Examples
 * <p/>
 * input
 * aaaa
 * aaaA
 * <p/>
 * output
 * 0
 * <p/>
 * input
 * abs
 * Abz
 * <p/>
 * output
 * -1
 * <p/>
 * input
 * abcdefg
 * AbCdEfF
 * <p/>
 * output
 * 1
 *
 * @author Belu
 */
public class _10PetyaAndStrings {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word1 = in.next();
        String word2 = in.next();

        System.out.print(compareStrings(word1, word2));

    }

    private static String compareStrings(String word1, String word2) {

        if (word1.compareToIgnoreCase(word2) < 0) {
            return "-1";
        } else if (word1.compareToIgnoreCase(word2) > 0) {

            return "1";
        } else {
            return "0";
        }

    }
}
