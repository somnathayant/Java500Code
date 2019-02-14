package com.servlet;







public class BasicExample {

	public static void main(String[] args) {
		
		
		
		
		try{
			int h=10/0;
		
			//int[] a=new int[4];
			
			//datatype vname;
			
			
			
			
			
		}
        
		catch(ArithmeticException e){
			//System.exit(0);
			
			System.out.println("A");
			
		}
        catch(Exception e){
			
			System.out.println("E");
		}
		finally{
			
			System.out.println("==========Finally");
		}

	}
	

}
