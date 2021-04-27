package com.ayantsoft.demo;

interface i{
	public void s();
}

class A{
	
	public static void show1() {
		System.out.println("static");
	}
	public void show() {
		System.out.println("ok");
	}
	A(){
		System.out.println("constructor");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i ob=new A()::show;
		
		ob.s();
		i ob1=A::show1;
		ob1.s();
		i ob2=A::new;
		ob2.s();

		
		
		
		/*i d=(int i)->{
			System.out.println(i);
		};
		
		i d1=(int i)->{
			System.out.println(i+"ok");
		};*/
		
		
		
	}

}
