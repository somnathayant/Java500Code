package com.servlet;

public class StringExample {

	public static void main(String[] args) {
		
		String s0="som";
		String s1 = "som";
		
		String s2 = "Som";
		
		String s3 = "somnath";
		
		String s4 = "SOMNATH";
		
		System.out.println(s1.equals(s0));//true
		
		
		
		System.out.println(s2.equals(s3));//false
		
		System.out.println(s1.equals(s4));//false;
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		
		System.out.println(s1.equalsIgnoreCase(s4));//false
		
		
		
		System.out.println((s0==s1));//true
		
		//using new operator
		
		String str1=new String("som");
		
		System.out.println(str1==s0);//false
		
		String str2=str1.intern();
		
		
					
		System.out.println(str2==s0);//true
		
		// using stringbuffer and stringbuilder as string is immutable
		
		String stImmute=new String("Somnath");
		
		String result=stImmute.concat(" Biswas");
		
		System.out.println(result);
		System.out.println(stImmute);
		
		
		
		
		
		
		StringBuffer strBF=new StringBuffer("somnath");
		
		strBF.append(" biswas");
		
		System.out.println(strBF);
		
		StringBuilder stringBL=new StringBuilder("Somnath");
		stringBL.append(" Biswas");
		
		System.out.println(strBF);
		
		

	}

}
