package com.java.test_comparator;
import java.math.BigInteger;
import java.util.*;
public class Test {

	public static void main(String args[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(10, "Harsh", BigInteger.valueOf(12000), 20));
		empList.add(new Employee(4, "Patil", BigInteger.valueOf(14000), 22));
		empList.add(new Employee(2, "Jack", BigInteger.valueOf(18000), 21));
		empList.add(new Employee(9, "Lion", BigInteger.valueOf(22000), 24));
		
		System.out.println("***  Available lists of Employee *** ");
		empList.forEach((e) -> {
			System.out.println(e);
		});
		
		System.out.println("***  Sorting employee list by Employee Id *** ");
		empList.sort(Comparator.comparing(Employee :: getId));
		empList.forEach((e) -> {
			System.out.println(e);      
		});
		
		System.out.println("***  Sorting employee list by Employee Name *** ");
		empList.sort(Comparator.comparing(Employee :: getName));
		empList.forEach((e) -> {
			System.out.println(e);      
		});
		
		System.out.println("***  Sorting employee list by Employee Salary Asc*** ");
		empList.sort(Comparator.comparing(Employee :: getSalary));
		empList.forEach((e) -> {
			System.out.println(e);
		});
		
		System.out.println("***  Sorting employee list by Employee Salary Desc*** ");
		empList.sort(Comparator.comparing(Employee :: getSalary).reversed());
		empList.forEach((e) -> {
			System.out.println(e);
		});
	}
}
