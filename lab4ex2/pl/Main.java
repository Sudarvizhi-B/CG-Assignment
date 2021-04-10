package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeInsuranceScheme;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.println("Enter your name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter your ID: ");
		emp.setId(sc.nextInt());
		System.out.println("Enter your Salary: ");
		emp.setSalary(sc.nextLong());
		System.out.println("Enter your Designation: ");
		emp.setDesignation(sc.next());
		
		System.out.println("ID is " +emp.getId());
		System.out.println("Name is " +emp.getName());
		System.out.println("Salary is " +emp.getSalary());
		System.out.println("Designation is " +emp.getDesignation());
		
		EmployeeInsuranceScheme eis = new EmployeeInsuranceScheme();
		System.out.println("Enter your salary and designation to know about scheme");
		
		eis.employeeinsurance(sc.nextLong(), sc.next());
		System.out.println("Insurance Scheme based on your salary and Designation is " +eis.getInsuranceScheme());
		
		sc.close();
		
	}

}
