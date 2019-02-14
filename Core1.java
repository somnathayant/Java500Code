package com.servlet;


 class Add{
	
	protected  int a;
	
	public void getInput(int h,String t){
		System.out.println("=====1");
	}
	
	public void getInput(String j,int k){
		System.out.println("=====2");
	}
	
	public void getInput(){
		System.out.println("=====3");
	}
	
	
	
}
class Student extends Add{
	
	
	public void getInput(){
		super.getInput();
		System.out.println("=====4"+a);//direct acces to a as it is protected
	}
	
	
}

class Student1 extends Student{
	
	
} 


public class Core1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add ob=new Add();
		Student st=new Student();
		
		st.getInput();
		
		
		
	}

}
