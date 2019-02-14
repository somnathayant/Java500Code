package com.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionNevigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList< String> ar = new ArrayList< String>();
	    ar.add("som");
	    ar.add("raju");
	    ar.add("andy");
	    ar.add("viks");
		
	    
	   /* Iterator it = ar.iterator();    //Declaring Iterator
	    while(it.hasNext())
	    {  
	       System.out.print(it.next()+" ");
	    }*/
	    
	    /*
		ListIterator litr = ar.listIterator();
	    while(litr.hasNext())   //In forward direction
	    {
	      System.out.print(litr.next()+" ");
	    }
	    while(litr.hasPrevious())   //In backward direction
	    {
	      System.out.print(litr.previous()+" ");
	    }
		    */
	    for(String str : ar)
	    {
	    	/*String d=str;*/
	    	if(ar.equals("som")){
	    		ar.remove(str);
	    	}
	      //System.out.print(str+" ");
	    }

	}

}
