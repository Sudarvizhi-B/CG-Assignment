package lab6;

import java.util.*;

public class SecondSmallest {

	public static int getSecondSmallest(Integer[] arr) {
		
		List<Integer> list = Arrays.asList(arr);
		
		Collections.sort(list);
		int ele = list.get(1);
		return ele;
		
	}

	public static void main(String args[]) {
		Integer[] arr = { 1, 2, 5, 6, 3, 2 };
		
		System.out.println("Second Smallest: " + getSecondSmallest(arr));
		
	}

}
