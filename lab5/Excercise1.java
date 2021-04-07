package lab5;

import java.util.Scanner;

public class Excercise1 {
	
	static void getAge(int age) throws InvalidAgeException{
		if(age<15) {
			throw new InvalidAgeException("Age below 15....");
		}
		else {
			 System.out.println("Age is "+age);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			getAge(age);
		}
		catch(InvalidAgeException e){
			e.printStackTrace();
		}
		sc.close();
		
	}

}
