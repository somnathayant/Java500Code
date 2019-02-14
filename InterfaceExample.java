package com.servlet;


/*interface i1{
	
	public void m1();
}


interface i2{

	public void m2();
}

i1 a=new 
class I1Impl implements i1,i2{
	
	public void m1(){
		
		System.out.println("===== default in inter1");
		
	}
	
	
public void m2(){
		
		System.out.println("===== default in inter1");
		
	}
}*/

interface inter1{
	//default //static
	
	
	public default void dis(){
		System.out.println("===== default in inter1");
	}
	
	public static void dis1(){
		System.out.println("===== static in inter1");
		
	}
	
	public  void disply();
	
}


interface inter2{
	public default void dis10(){
		System.out.println("===== default in inter2");
	}
	public static void dis1(){
		System.out.println("===== static in inter2");
		
	}
	
	public void displayInterface2();
	
}

class ImplInter implements inter1,inter2{
	
	public void disply(){
		
		
	}
	
	public void displayInterface2(){
		
	}
	
	
	/*public void dis(){
		
		inter1.super.dis();
		//inter2.super.dis();
	}*/
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplInter ob=new ImplInter();
		
		ob.dis();
		
		
		inter2.dis1();
	 
		
	}

}
