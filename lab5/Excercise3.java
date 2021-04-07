package lab5;

import java.util.Scanner;

public class Excercise3 {
	
	static void getSalary(double salary) throws EmployeeException{
		if(salary<3000) {
			throw new EmployeeException("Salary below 3000...");
		}
		else {
			System.out.println("Salary is:" +salary);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		try {
			getSalary(salary);
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
