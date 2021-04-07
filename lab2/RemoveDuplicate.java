package lab2;

import java.util.Scanner;

import java.util.Arrays;

public class RemoveDuplicate {

	static int[] removeDuplicate(int[] arr) {
		
		int j = 0;
		int[] result = new int[arr.length];
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j] = arr[arr.length - 1];

		for (int i = j; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		removeDuplicate(arr);
	}

}
