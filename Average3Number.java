package Functions;

import java.util.Scanner;

/**
 * Enter 3 numbers from the user & make a function to print their average.
 *
 */

public class Average3Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number A, B, C ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		average3Num(a, b, c);
	}

	public static void average3Num(int a, int b, int c) {
		int avg;
		avg = (a + b + c) / 3;
		System.out.println(avg);
	}

}
