package com.servlet;

/*class T1 extends Thread{  
public void run(){  
	
System.out.println("thread is running...");  
}  
}


class T2 implements Runnable{  
public void run(){  
System.out.println("thread is running 1...");  
}  
}*/

abstract class Abs1{
	
	public void method1(){

		System.out.println("implemented method");
	}
	
    abstract Integer method2();
	
}//control here child class has to have same name



public class EX1 {
	public static void main(String [] args){
		
		/*T1 t1=new T1();  
		t1.start(); */
		/*T2 m1=new T2();  
		Thread t2 =new Thread(m1);  
		t2.start();*/
	}
}
