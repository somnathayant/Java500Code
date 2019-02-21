package com.servlet;

interface i1{
	
	public void m1();
}

 abstract class Hero{
	
	public abstract void m11();
	public void m10(){
		System.out.println("kkk");
	}
}

 class Demo{
	 
	 public void m10(i1 iterface1){
		 
		 iterface1.m1();
		 
	 }
	 
 }
 
public class AnnonymousEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i1 ob=new i1(){
			public void m1(){
				System.out.println("====oo");
			}
		};

		ob.m1();
		
		Hero h1=new Hero(){
			
			public void m11(){
				System.out.println("coming");
			}
		};
		
		h1.m10();
		h1.m11();	
		
		Demo d=new Demo();
		d.m10(ob);
		
		
		
		
		
	}

}
