package com.testbean.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private static int counter;
	
	public Employee() {
		++counter;
	}
	
	public static int getEmployeeBeanInstance() {
		return counter;
	}
	
	private String name;


	private String age;
	

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
	
}
