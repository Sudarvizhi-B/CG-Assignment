package lab1;

import java.util.Scanner;

public class StopReadyGo {
	
	static void trafficLight(String button) {
		
		switch(button) {
		
		case "red":
			System.out.println("Stop");
			break;
			
		case "yellow":
			System.out.println("Ready");
			break;
			
		case "green":
			System.out.println("Go");
			break;
		
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String button = sc.next();
		
		trafficLight(button);
		
		sc.close();

	}
	

}
