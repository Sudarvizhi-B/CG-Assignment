package lab1;

import java.util.Scanner;

public class NumInIncOrder {
	
	static boolean numInIncOrder(int n) {
		
		String str = Integer.toString(n);
		char[] c = str.toCharArray();
		
		for(int i=0; i<str.length()-1; i++) {
			if(c[i] > c[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(numInIncOrder(n));
		sc.close();

	}

}
