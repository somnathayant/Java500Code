package com.servlet;



abstract class abs1{
	
	public void method1(){

		System.out.println("implemented method");
	}
	
	abstract Integer method2();
	
}//control here child class has to have same name


class abs2 extends abs1{
	 
	public Integer method2(){
		
		return 2*5;
	}
 }



  class abs3 extends abs1{
	 
		public Integer method2(){
			return 2*10;
		}
	}

public class AbstractionExample {
	public static void main(String[] args){
		
		
		
	}
}
