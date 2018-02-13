package com.codeforces;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of
 * paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one
 * corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is
 * considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given
 * the current situation. Determine whether it is dangerous or not.
 * <p/>
 * Input
 * The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does
 * not exceed 100 characters. There's at least one player from each team present on the field.
 * <p/>
 * Output
 * Print "YES" if the situation is dangerous. Otherwise, print "NO".
 * <p/>
 * Examples
 * <p/>
 * input
 * 001001
 * <p/>
 * output
 * NO
 * <p/>
 * input
 * 1000000001
 * <p/>
 * output
 * YES
 *
 * @author Belu
 */
public class _09Football {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next();

        System.out.println(evaluate(input));

    }

    private static String evaluate(String input) {

        Pattern p = Pattern.compile("[0-1]*?[0]{7,}[0-1]*?");

        Matcher m = p.matcher(input);

        Pattern p2 = Pattern.compile("[0-1]*?[1]{7,}[0-1]*?");

        Matcher m2 = p2.matcher(input);


        if(m.matches()||m2.matches()){
            return "YES";
        }


        return "NO";

    }
}
