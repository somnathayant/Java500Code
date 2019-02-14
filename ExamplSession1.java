package com.servlet;

class Address{
	private  String city;
}

class Employee extends Address{
	
	private int i;
	
	public void getData(){
		
		//city="alabama";
		i=90;
		System.out.println(i);
		
	}
}
public class ExamplSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ob=new Employee();
		ob.getData();
	}

}
