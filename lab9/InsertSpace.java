package lab9;

import java.util.Scanner;

interface Interface1{
	String insertSpace(String str);
}

public class InsertSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Interface1 intf = str -> {
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i)+" ");
			}
			return str;
		};
		intf.insertSpace(s);
		sc.close();
	}

}
