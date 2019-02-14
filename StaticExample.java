package com.servlet;

class SimpleStaticExample
{	
	public static int st1;
	public int st2;
	 public void show()
	  {
	    System.out.println("Hello"+st1+st2);
	  }
	  public static void display()
	  {
	    //show( );//here non-static can not be called 
		  
	    SimpleStaticExample ob=new SimpleStaticExample();
	    ob.show();//but here after creating object then we can call
	    System.out.println("Hello"+st1+ob.st2);
	  } 
   
}



public class StaticExample {
	
	 public static void main(String[] args)
	    {
		 SimpleStaticExample ob=new SimpleStaticExample();
	         //ob.show();
	         StringBuilder sb=new StringBuilder();
	         StringBuilder sd=new StringBuilder("somnath");
	         
	         String st="som";
	         System.out.println(st.hashCode());
	         st=st+"nath";
	         System.out.println(st.hashCode());
	         
	         
	         
	         
	         
	    }

}
