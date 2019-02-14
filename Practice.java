package com.servlet;

class St{
	
	private  String stName;
	private  Integer age;
	
	public void setData(String stName,Integer age){
		
		/*this.stName=stName;
		this.age=age;
		*/
		stName=stName;//here out put will be null for both the values as jvm wont understand where to assign
		age=age;       //i.e the difference among the instance variables and local ones if you use this keyword  
		                //we will get proper output
		
	}
	
	public void getData(){
		System.out.println(stName);
		
		System.out.println(age);
		
	}
	
}


 public class Practice {
	
	public static void main(String args[]){
		
		St ob=new St();
		
		ob.setData("somnath",32);
		ob.getData();
	}	
		
}
