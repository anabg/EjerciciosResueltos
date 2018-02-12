package com.codeforces;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * STRING TASK
 * <p/>
 * Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do
 * the following: in the given string, consisting if uppercase and lowercase Latin letters, it:
 * <p/>
 * *deletes all the vowels,
 * *inserts a character "." before each consonant,
 * *replaces all uppercase consonants with corresponding lowercase ones.
 * <p/>
 * Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants.
 * The program's input is exactly one string, it should return the output as a single string,
 * resulting after the program's processing the initial string.
 * <p/>
 * Help Petya cope with this easy task.
 * <p/>
 * Input
 * The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length
 * is from 1 to 100, inclusive.
 * <p/>
 * Output
 * Print the resulting string. It is guaranteed that this string is not empty.
 * <p/>
 * Examples
 * input
 * tour
 * <p/>
 * output
 * .t.r
 * <p/>
 * input
 * Codeforces
 * <p/>
 * output
 * .c.d.f.r.c.s
 * <p/>
 * input
 * aBAcAba
 * <p/>
 * output
 * .b.c.b
 *
 * @Author Belen
 */
public class _05StringTask {

    public static String getOutputString(String inWord) {

        String finalWord = inWord.replaceAll("[aeiouyAEIOUY]", "").toLowerCase();

        Pattern p = Pattern.compile("([a-zA-Z])");
        Matcher m = p.matcher(finalWord);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(result, "." + m.group(1));
        }
        m.appendTail(result);
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.next();

        System.out.println(getOutputString(word));


    }
}
