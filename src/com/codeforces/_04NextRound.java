package com.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Next Round
 *
 * "Contestant who earns a score equal to or greater than the k-th place
 * finisher's score will advance to the next round, as long as the contestant
 * earns a positive score..." — an excerpt from contest rules.
 * <p>
 * A total of n participants took part in the contest (n ≥ k), and you already
 * know their scores. Calculate how many participants will advance to the next
 * round.
 * <p>
 * Input: The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤
 * 50) separated by a single space.
 * <p>
 * The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤
 * 100), where ai is the score earned by the participant who got the i-th place.
 * The given sequence is non-increasing (that is, for all i from 1 to n - 1 the
 * following condition is fulfilled: ai ≥ ai + 1).
 * <p>
 * Output: Output the number of participants who advance to the next round.
 * <p>
 * <p>
 * Examples
 * input
 * 8 5
 * 10 9 8 7 7 7 5 5
 * output
 * 6
 * input
 * 4 2
 * 0 0 0 0
 * output
 * 0
 * Note
 * In the first example the participant on the 5th place earned 7 points. As the
 * participant on the 6th place also earned 7 points, there are 6 advancers.
 * <p>
 * In the second example nobody got a positive score.
 *
 * @author æBelu
 */
public class _04NextRound {

    private static int calculateNextRoundParticipant(List<Integer> values, int position) {

        int counter = 0;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(position - 1) > 0) {
                if (values.get(i) >= values.get(position - 1)) {
                    counter++;
                }
            } else if (values.get(position - 1) == 0) {
                if (values.get(i) > values.get(position - 1)) {
                    counter++;
                }
            }

        }

        return counter;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        List<Integer> values = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            int input = in.nextInt();
            values.add(input);
        }

        int val = values.get(k - 1);

        System.out.println(calculateNextRoundParticipant(values, k));

    }

}
