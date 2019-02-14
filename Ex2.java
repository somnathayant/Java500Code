package com.servlet;


class SleepMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepMethod1 t1=new SleepMethod1();  
		SleepMethod1 t2=new SleepMethod1();  
		   
		  t1.start();  
		  t2.start();  

	}

}
