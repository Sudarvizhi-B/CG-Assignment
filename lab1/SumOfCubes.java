package lab1;

import java.util.Scanner;

public class SumOfCubes {
	
	static int soc(int n) {
		
		int r, s=0;
		
		while(n>0) {
			
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		System.out.println("Sum of Cubes is "+s);
		
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		soc(n);
		
	}

}
