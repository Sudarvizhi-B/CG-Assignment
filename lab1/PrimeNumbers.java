package lab1;

import java.util.Scanner;

public class PrimeNumbers {
	
	static void prime(int n) {

		int i=0;
		
		for (i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j<=i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
		sc.close();
	}
}
