package lab1;

import java.util.Scanner;

public class Sum {
	
	static int calculateSum(int n) {
		
		int S=0;
		
		System.out.print("Sum of First "+ n +"natural numbers is: ");
		
		for(int i=0; i<n; i++) {
			if(i%3 == 0 || i%5== 0) {
				S += i;
			}
			
		}
		System.out.print(S);
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		int n = sn.nextInt();
	
		calculateSum(n);
	}

}
