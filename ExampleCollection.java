package com.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExampleCollection {
	public static void main(String[] args){

	try{
		   
				   
	      ArrayList<String> list=new ArrayList<String>();//Creating arraylist
	      
	       //List list=new ArrayList();  
	      
	      
	      list.add("Jason");  
	      list.add("Tejas");
	      list.add("Tejas");
	      
	      list.add("Jason");  
	      list.add("Tejas1");
	      
	      //list.add(new Integer(20));
	      
	      Iterator<String> itr0=list.iterator(); 
	      
	      //Iterator <String>it1=list.iterator();
	      
	      for(String s:list){
	    	  System.out.println(s);
	      }
	      
		  while(itr0.hasNext()){  
			  
		   System.out.println(itr0.next());  
		   
		  } 

	//hashset starts here

	HashSet<String> set=new HashSet<String>(); 
	
	  set.add("somnath");  
	  set.add("somnath");  
	  set.add("jason");  
	    
	  //Traversing elements  
	  Iterator<String> itr1=set.iterator(); 
	  
	  while(itr1.hasNext()){  
	   System.out.println(itr1.next());  
	  }  
	  
	  
	  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  
	  
	  
	  //Map<Integer,String> m1=new  HashMap<Integer,String>();
	  
	  
	  map.put(100,"Som");  
	  map.put(1001,"Rahul11");
	  map.put(1001,"Rahul");
	  map.put(102,"Lester");  
	  map.put(null,"Lester1"); 
	  map.put(200,"som");
	 // map.put(null,"Lester2"); 
	  
	  for(Map.Entry m:map.entrySet()){  
		  
	   System.out.println(m.getKey()+" "+m.getValue()+"===");  
	  }  
	  
	     }catch(Exception ex){
	    	 System.out.println(ex.getMessage());  
	}
	  
}     
}
	
	

