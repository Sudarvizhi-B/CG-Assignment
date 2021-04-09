package lab3;

import java.util.Scanner;
public class StringPositive {
	
	static boolean stringPositive(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					return false;
				}
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.print(stringPositive(str));
		
	}

}
