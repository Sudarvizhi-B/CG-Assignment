package lab6;

import java.util.*;

public class ReverseAndSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] num = new Integer[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		List<Integer> list = Arrays.asList(num);
		
		Collections.reverse(list);
		System.out.print("Reversed Array: ");
		System.out.print(list+" ");
		Collections.sort(list);
		System.out.print("\nSorted Array: ");
		System.out.print(list+" ");
	}

}
