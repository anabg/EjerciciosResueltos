package com.codeforces;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.
 * The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:
 * Operation ++ increases the value of variable x by 1.
 * Operation -- decreases the value of variable x by 1.
 * <p/>
 * A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without
 * spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.
 * A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the
 * statements it contains.
 * <p/>
 * You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value
 * of the variable when this programme is executed).
 * <p/>
 * Input
 * The first line contains a single integer n (1???n???150) — the number of statements in the programme.
 * Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as
 * letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.
 * <p/>
 * Output
 * Print a single integer — the final value of x.
 * <p/>
 * Examples
 * input
 * 1
 * ++X
 * <p/>
 * output
 * 1
 * input
 * 2
 * X++
 * --X
 * <p/>
 * output
 * 0
 *
 * @author Belu
 */
public class _08BitPlasPlas {

    public static int calculateValue() {

        int result = 0;
        Scanner in = new Scanner(System.in);
        int statementNumber = in.nextInt();

        /*Pattern p = Pattern.compile("[+]{2}X");
        Matcher m = p.matcher("++X");

        Pattern p2 = Pattern.compile("X[+]{2}");
        Matcher m2 = p.matcher("++X");

        Pattern p3 = Pattern.compile("[-]{2}X");
        Matcher m3 = p.matcher("++X");

        Pattern p4 = Pattern.compile("X[-]{2}");
        Matcher m4 = p.matcher("++X");

        System.out.println(m.matches());
        System.out.println(m2.matches());*/

        for (int i = 0; i < statementNumber; i++) {
            String statement = in.next();
            if (statement.equalsIgnoreCase("x++") || statement.equalsIgnoreCase("++x")) {
                result++;
            } else if (statement.equalsIgnoreCase("x--") || statement.equalsIgnoreCase("--x")) {
                result--;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(calculateValue());
    }
}
