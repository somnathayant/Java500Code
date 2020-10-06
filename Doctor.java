package com.ayantsoft.core1.ems;

import java.io.Serializable;

public class Doctor implements Serializable {

	/**
	 * serialVersionUID = -6205620861981613285L;
	 */
	private static final long serialVersionUID = -6205620861981613285L;
	private String name;
	private int age;
	private int salary;
	
	
	
	public Doctor(String st,int a,int s){
		name=st;
		age=a;
		salary=s;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
