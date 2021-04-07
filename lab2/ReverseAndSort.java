package lab2;

import java.util.Scanner;

public class ReverseAndSort {

	int reverse(int[] a) {

		int i;

		System.out.println("Reversed array ");

		for (i = a.length - 1; i >= 0; i--) {

			System.out.print(" " + a[i]);
		}
		return 0;
	}

	int sort(int[] a) {

		int j, k, temp = 0;

		System.out.println();

		System.out.println("Sorted array ");

		for (j = 0; j <= a.length - 1; j++) {

			for (k = 0; k <= a.length - 1; k++) {

				if (a[j] > a[k]) {

					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the array integers: ");

		for (int i = 0; i < size; i++) {

			a[i] = sc.nextInt();
		}

		ReverseAndSort rs = new ReverseAndSort();
		rs.reverse(a);
		rs.sort(a);

	}

}
