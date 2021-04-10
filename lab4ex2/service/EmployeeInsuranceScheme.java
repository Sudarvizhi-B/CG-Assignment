package com.cg.eis.service;

public class EmployeeInsuranceScheme implements EmployeeService{
	
	private long salary;
	private String designation;
	private String insuranceScheme;
	
	public EmployeeInsuranceScheme(){}
	public EmployeeInsuranceScheme(long salary, String designation){
		this.salary = salary;
		this.designation = designation; 
	}

	@Override
	public long getSalary() {
		return salary;
	}

	@Override
	public String getDesignation() {
		return designation;
	}

	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	
	@Override
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
		
	}

	
	public void employeeinsurance(long salary, String designation) {
		if((salary>8000 && salary < 20000) || (designation == "Associate")){
			setInsuranceScheme("Scheme C");
		}
		else if((salary >=20000 && salary < 35000)|| (designation == "Programmer")) {
			setInsuranceScheme("Scheme B");
		}
		else if((salary >=35000) || (designation == "Manager")){
			setInsuranceScheme("Scheme A");
		}
		else {
			setInsuranceScheme("No Scheme");
		}
	}
	
}
