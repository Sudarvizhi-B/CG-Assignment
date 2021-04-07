package lab2;

import java.util.Scanner;

public class SecondSmallest {
	
	int secondsmallest(int[] arr) {
		
		int i,temp=0;
		
		for(i=0; i<arr.length-1;i++) {
			
			for(int j=0; j<arr.length-1; j++) {
			
				if(arr[j]>arr[j+1]) {
				
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Second Smallest number is "+arr[1]);
		return arr[1];
	}

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the Size of an array; ");
		
		int size = x.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array elements");
		
		for(int i=0; i<size; i++) {
			
			arr[i] = x.nextInt();
		}
		
		SecondSmallest ss = new SecondSmallest();
		
		ss.secondsmallest(arr);
	}

}
