package com.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Taxi
 * <p>
 * outputstandard output
 * <p>
 * After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday.
 * We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together.
 * They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the
 * children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?
 * <p>
 * Input
 * The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren.
 * The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4).
 * The integers are separated by a space, si is the number of children in the i-th group.
 * <p>
 * Output
 * Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.
 * <p>
 * Examples
 * inputCopy
 * 5
 * 1 2 4 3 3
 * outputCopy
 * 4
 * inputCopy
 * 8
 * 2 3 4 4 2 1 3 1
 * outputCopy
 * 5
 * <p>
 * <p>
 * Note
 * In the first test we can sort the children into four cars like this:
 * <p>
 * the third group (consisting of four children),
 * the fourth group (consisting of three children),
 * the fifth group (consisting of three children),
 * the first and the second group (consisting of one and two children, correspondingly).
 * There are other ways to sort the groups into four cars.
 * Created by �Belu on 13/2/2018.
 */
public class _13Taxi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOf = in.nextInt();
        int number = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < numberOf; i++) {
            number = in.nextInt();
            numbers.add(number);
        }
        System.out.print(countAmountOfTaxis(numberOf, numbers));

    }

    public static int countAmountOfTaxis(int numberOfGroups, ArrayList<Integer> numbers) {
        Integer sum = 0;
        /*for (Integer nro : numbers) {
            sum += nro;
        }
        if(sum%4>0){
            return ((sum/4)+1);
        } else return sum / 4;*/

        int counter = 0;
        int rest = 0;
        int value = 0;
        for (Integer nro : numbers) {
            value= nro + rest;
            if(value%4==0){
                counter ++;
                rest=0;
            } else {
                rest= sum%4;
            }

        }
        return counter;
    }
}
