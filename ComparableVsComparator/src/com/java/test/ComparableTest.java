package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String args[]) {
		List<Employee> empLists=new ArrayList<>();
		empLists.add(new Employee(4,"Harsh","ABC"));
		empLists.add(new Employee(1,"HArsh","ABC"));
		empLists.add(new Employee(5,"Harsh","ABC"));
		
		Collections.sort(empLists);
		
		empLists.forEach((e)-> {
			System.out.println(e);
		});
	}
}
