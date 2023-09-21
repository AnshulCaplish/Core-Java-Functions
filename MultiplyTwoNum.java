package Functions;

import java.util.Scanner;

public class MultiplyTwoNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value A");
		int a = sc.nextInt();
		System.out.println("Enter value B");
		int b = sc.nextInt();
		multiplyTwoNumber(a,b);
	}
	
	public static int multiplyTwoNumber(int a, int b) {
		int mul = a*b;
		System.out.println(mul);
		return mul;
	}
}
