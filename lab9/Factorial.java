package lab9;

import java.util.Scanner;

@FunctionalInterface
interface Interface3{
	int factorial(int f);
}
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		Interface3 intf = f -> {
			for(int i=1; i<fact; i++) {
				f*=i;
			}
			return f;
		};
		
		System.out.print("Factorial: "+intf.factorial(fact));
		sc.close();
	}

}
