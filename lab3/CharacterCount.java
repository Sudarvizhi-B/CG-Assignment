package lab3;

import java.util.Scanner;

public class CharacterCount {
	
	public static int characterAndWordCount(String str) {
		int charcount = 0;
		int wordcount = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				charcount+=1;
			}
			
			else {
				wordcount+=1;
			}
		}
		System.out.println("Number of Characters: "+charcount);
		System.out.println("Number of Words: "+(wordcount+1));
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		characterAndWordCount(str);
		sc.close();
	}

}
