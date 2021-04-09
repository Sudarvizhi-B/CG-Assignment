package lab3;
import java.util.Scanner;
public class ReplaceConsonant {
	static String replaceConsonant(String str) {
		
		StringBuffer sb = new StringBuffer();
		char[] ch = str.toCharArray();
		for(char c : ch) {
			if(c!= 'A' && c!= 'a' && c!= 'E' && c!= 'e' && c!= 'I' && c!= 'i' && c!= 'o' && c!= 'O' && c!= 'U' && c!= 'u') {
				c = (char) (c+1);
				sb.append(c);
			}
			else {
				sb.append(c);
			}
			
		}
		System.out.print(sb.toString());
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		replaceConsonant(str);
		sc.close();
	}

}
