package lab5;

import java.util.Scanner;

public class Excercise2{
	
	static void getName(String firstName, String lastName)throws InvalidNameException{
		
		if(firstName.length() == 0 || lastName.length() == 0) {
			throw new InvalidNameException("Name shouldn't be incomplete");
		}
		else {
			System.out.println(firstName+" "+lastName);
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstName = null;
		firstName = sc.nextLine();
		String lastName = null;
		lastName = sc.nextLine();
		try {
			getName(firstName, lastName);
		}
		catch(InvalidNameException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
