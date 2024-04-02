package com.java.test_comparator;

import java.math.BigInteger;
/**
 * 1) Comparator present under java.lang package.
 * 2) It will provide multiple sort of sequence.
 * 3) It is has compare method , which compare two different objects.
 * 4) suppose you have a class Employee which contain attribute like id,name
 * salary ,age or etc. and you want comparasion based on the different
 * attribute then you have to go with comparator.
 */
public class Employee {

	private long id;
	
	private String name;
	
	private BigInteger salary;
	
	private int age;
	
	public Employee(long id,String name,BigInteger salary,int age) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public BigInteger getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [ id : "+id+" , name "+name+" , salary "+salary+" , age "+age+" ]";
	}
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o1.name.compareTo(o2.name);
//	}
	
}
