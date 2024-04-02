package com.java.test;
/**
 * Comparable provide default natural order of sequnce.
 * It has compareTo method , which compare with own objects.
 * It provide only one sort of sequence.
 * Comparable present under java.util package
 * In case of comparable you can sort only int type of data , not a String
 */
public class Employee implements Comparable<Employee>{

	private int empId;
	
	private String empName;
	
	private String compName;
	
	public Employee(int empId,String empName,String compName) {
		this.empId=empId;
		this.empName=empName;
		this.compName=compName;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setCompName(String compName) {
		this.compName=compName;
	}
	
	public String getCompName() {
		return compName;
	}
	
	@Override
	public String toString() {
		return "Employee { empId = "+empId+" empName = "+empName+" compName = "+compName+" }";
	}
	
	//In case of comparable you can sort only int type of data , not a String
	@Override
	public int compareTo(Employee employee) {
		if (empId == employee.empId) {
			return 0;
		} else if (empId > employee.empId) {
			return 1;
		} else {
			return -1;
		}
	}
}
