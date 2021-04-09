package lab6;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountCharacters {
	
	public static Map<Character, Integer>countChar(char[] ch){
		
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(int i=0; i<ch.length; i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		
		return map;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		System.out.print(countChar(ch));;
		sc.close();
	}

}
