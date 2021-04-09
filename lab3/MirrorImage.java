package lab3;

import java.util.Scanner;

public class MirrorImage {
	static String mirrorImage(String str) {
		System.out.print(str+"|");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.print(sb.toString());
        return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        mirrorImage(str);
        sc.close();
	
	}

}
