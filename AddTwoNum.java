package Functions;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value A");
		int a= sc.nextInt();
		System.out.println("Enter Value B");
		int b= sc.nextInt();
		AddTwoNumber(a,b);
	}
	
	public static int AddTwoNumber(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
}


