package lab9;

import java.util.Scanner;

interface Interface{
	double power(int x, int y);
}
public class PowerOfXandY {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Interface intf = (i,j) -> {return Math.pow(i,j);};
		System.out.print(intf.power(x,y));
		sc.close();
	}

}
