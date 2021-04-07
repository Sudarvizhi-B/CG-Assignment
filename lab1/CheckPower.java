package lab1;

import java.util.Scanner;

public class CheckPower {
	
	public static boolean checkPower(int n) {
		if (n <= 0) {
			return false;
		}
		while (n % 2 == 0) {
			n = n / 2;
		}
		
		return n == 1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(checkPower(n));
		sc.close();
	}

}
