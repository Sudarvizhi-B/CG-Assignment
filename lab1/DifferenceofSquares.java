package lab1;

import java.util.Scanner;
public class DifferenceofSquares {
	
	static int calculateDifference(int n) {
		
		int i,r, sum = 0, s=0, square, diff;
		for(i=1; i<=n; i++) {
			r = i*i;
			sum+=r;
			
		}
		System.out.println("Sum of Squares is "+sum);
		for(i=1; i<=n; i++){
			s = s+i;
		}
		square = s*s;
		System.out.println("Square of Sum is "+square);
		diff = sum - square;
		System.out.println("Difference is "+diff);
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		calculateDifference(n);
		
	}

}
