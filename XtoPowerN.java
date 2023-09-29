package Functions;

import java.util.Scanner;

/**
 * Two numbers are entered by the user, x and n. Write a function to find the value of one number raised 
 * to the power of another i.e. xn.
 *
 */
public class XtoPowerN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter value of X & N");
		int x = sc.nextInt();
		int n = sc.nextInt();
		powerToN(x, n);
	}

	public static void powerToN(int a, int b) {
		if (a > 0 && b > 0) {
			int power = 1;
			for (int i = 1; i <= b; i++) {
				power = power * a;
			}
			System.out.println("Power: " + power);
		}
	}
}
