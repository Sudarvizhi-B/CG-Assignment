package lab2;

import java.util.Scanner;

public class SortString {
	public static String[] sortString(String[] str) {
		int mid = 0;
		String[] str1 = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 == 0) {
				mid = str[i].length()/ 2;
			} else {
				mid = (str[i].length() + 1) / 2;
			}
			str1[i] = str[i].substring(0, mid).toUpperCase().concat(str[i].substring(mid, str[i].length()).toLowerCase());
		}
		for (String S : str1) {
			System.out.println(S);
		}
		return str1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n]; 
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		sortString(str);
		sc.close();
	}



}
