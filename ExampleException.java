package com.servlet;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;


class MyEx extends Exception{
	
	MyEx(){
		
		//System.out.println("Low Balance then 10000 ");
	}
MyEx(int t){
		
		//System.out.println("Low Balance then 5000 ");
	}
}

public class ExampleException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try{
			int acc_bal=8000;
			
			if(acc_bal<10000){
				
			throw new  MyEx();
			
			}else{
				throw new MyEx(0);
			}
		}
		catch(MyEx e){
			
			System.out.println("general message it is no specific one");
			
		}
		//catch block always based on exception class thrown
		
		catch(ArithmeticException e){
			
			System.out.println("here we caught the exception");
			 System.exit(0);
			 
		}
		catch(Exception e){
			System.out.println("=====ok");
			
		}
		
		finally{
			//close connection
			System.out.println("=====finally");
		}
		
		
		/*try
		{
			
		int a=0;
		
		int g=9;
		
		int h=g/a;
		
		System.out.println("===");
		
		
		}
		//System.exit(0);

		catch(ArithmeticException e){
			
			System.out.println("here we caught the exception");
			
			if(true){
				//System.exit(0);
			}else{
				
			}
			
			
			 
		}
		
		catch(Exception ex){
			
			System.out.println("here we caught the exception");
			
			
		}

		finally{
			//close connection
			System.out.println("=====finally");
		}
*/		
		
		
	}

}
