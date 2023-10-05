package Functions;

/**
 * Write a program to print Fibonacci series of n terms where n is input by user :
	0 1 1 2 3 5 8 13 21 ..... 
 *
 */
public class FibonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		int n=10;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=1; i<=n; i++) {
			sum=a+b;		
			a=b;
			b=sum;
			
			System.out.print(sum + " ");
		}

	}

}
