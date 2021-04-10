package com.cg.eis.service;

public interface EmployeeService {
	public long getSalary();
	public String getDesignation();
	public void setSalary(long salary);
	public void setDesignation(String designation);
	public String getInsuranceScheme();
	public void setInsuranceScheme(String insuranceScheme);
	void employeeinsurance(long salary, String designation);
}
