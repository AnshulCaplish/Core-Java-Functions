package Functions;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter Value N");
		int n = sc.nextInt();
		factorial(n);
	}
	
	public static void factorial(int n) {
		int factorial = 1;
		for(int i=n; i>1; i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
}

}
