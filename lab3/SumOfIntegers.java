package lab3;

import java.util.*;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		int n;
		int sum  = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
	
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.print(n+" ");
			sum = sum+n;
		}
		System.out.println();
		System.out.println(sum);
		sc.close();
	
	}

}
