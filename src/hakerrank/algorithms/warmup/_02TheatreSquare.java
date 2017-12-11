package hakerrank.algorithms.warmup;

import java.util.Scanner;
/*
 * 1000000000 
 */
/**
 * Theatre Square in the capital city of Berland has a rectangular shape with
 * the size n × m meters. On the occasion of the city's anniversary, a decision
 * was taken to pave the Square with square granite flagstones. Each flagstone
 * is of the size a × a.
 * 
 * What is the least number of flagstones needed to pave the Square? It's
 * allowed to cover the surface larger than the Theatre Square, but the Square
 * has to be covered. It's not allowed to break the flagstones. The sides of
 * flagstones should be parallel to the sides of the Square.
 * 
 * Input The input contains three positive integer numbers in the first line: n,
 * m and a (1 ≤ n, m, a ≤ 109).
 * 
 * Output Write the needed number of flagstones.
 * 
 * @author æAnita
 *
 */
public class _02TheatreSquare {

	public static long numberOfFlagstones(int n, int m, int a) {

		/*
		 * int squareArea = n * m; int flagstonesArea = a * a; int
		 * countLargeFlagstone = (int) n / a; int countAnchoFlagstones = (int) m
		 * / a;
		 */

		int squareArea = n * m;
		int flagstonesArea = a * a;
		int countLargeFlagstone = 0;

		countLargeFlagstone = (int) n / a;
		if ((n % a) > 0) {

			countLargeFlagstone = countLargeFlagstone + 1;

		}

		int countAnchoFlagstones = (int) m / a;

		if ((m % a) > 0) {

			countAnchoFlagstones = countAnchoFlagstones + 1;

		}

		return (long) countLargeFlagstone * countAnchoFlagstones;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();

		// System.out.println(n + " " + m + " " + a );

		System.out.println(_02TheatreSquare.numberOfFlagstones(n, m, a));

	}

}
