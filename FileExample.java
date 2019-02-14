package com.servlet;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String args[]) throws IOException {  
	      //FileInputStream in = null;
	      //FileOutputStream out = null;
	      FileReader in = null;
	      FileWriter out = null;
	      try {
	         //in = new FileInputStream("/home/FileA");
	       //  out = new FileOutputStream("/home/FileB");
	        
		in = new FileReader("/home/somnath/A_file/FileA");
	         out = new FileWriter("/home/somnath/A_file/FileB");
	        
	 
	         int c;
	         while ((c = in.read()) != -1) {
			char ch=(char)c;
			
			if(ch=='c'){
			System.out.println("it is caught");
			}
			//System.out.print(ch);
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	
	
}
