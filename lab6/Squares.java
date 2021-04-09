package lab6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Squares {
	
	public static Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> square= new HashMap();
		for(int sq: arr) {
			if(!square.containsKey(sq)) {
				square.put(sq, sq*sq);
			}else {
				continue;
			}
		}
		return square;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(getSquares(arr));

}
}