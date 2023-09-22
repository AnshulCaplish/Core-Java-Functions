package Functions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Prime or not");
		
		int n = sc.nextInt();
		sc.close();
			boolean check = true;
	if(n>1) {
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				check=false;
				break;
			}
			
		}
	}
	
	if(n==1) {
		check=false;
	}
	
	if(check==false) {
		System.out.println("Not Prime number");
	}
	
	else {
		System.out.println("Prime");
	}

	}

}
