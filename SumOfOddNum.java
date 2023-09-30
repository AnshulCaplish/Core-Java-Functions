package Functions;

import java.util.Scanner;

/**
 * Write a function to print the sum of all odd numbers from 1 to n.
 *
 */
public class SumOfOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number N");
		int n = sc.nextInt();
		sumOfOddNum(n);
	}

	public static void sumOfOddNum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
