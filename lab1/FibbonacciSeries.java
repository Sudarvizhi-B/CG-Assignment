package lab1;

import java.util.Scanner;

public class FibbonacciSeries {
	
	static int fibbonacci(int n1) {
		
		int a=0,b=1,c=0;
		
		for(int i=0; i<n1; i++){
			a = b;
			b = c;
			c = a+b;
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("Last Element in Fibbonacci series is "+c);
		return 0;
		
	}

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		fibbonacci(n1);
		
		sc.close();

	}

}
