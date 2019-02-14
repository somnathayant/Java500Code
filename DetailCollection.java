package com.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class DetailCollection {

	public  static void main(String args[]){
		
		
		ArrayList <String>al=new ArrayList();
		al.add("f");
		al.add("b");
		al.add("c");
		al.add("a");
		


		Vector <String>v=new Vector();
		v.add("i");
		v.add("j");
		v.add("k");
		v.add("l");

		Iterator<String> iteratorV = v.iterator();
		while (iteratorV.hasNext()) {
			System.out.println("==V"+iteratorV.next());
		}
		
		
		for (String element : al) {
			System.out.println("="+element);
		}

		al.remove("c");
		
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println("=="+iterator.next());
		}


		List<String> listStrings = new LinkedList<String>();
		listStrings.add("Five");
		listStrings.add("Six");
		listStrings.add("Seven");
		listStrings.add("Eight");
		System.out.println(listStrings);

		//========================================================
		//set starts here


		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");



		LinkedHashSet<String> linkedset =  
				new LinkedHashSet<String>();   

		// Adding element to LinkedHashSet   
		linkedset.add("A");   
		linkedset.add("B");   
		linkedset.add("C");   

		 Iterator<String> itr=linkedset.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

		TreeSet<String> al1=new TreeSet<String>();  
		al1.add("x");  
		al1.add("z");  
		al1.add("k");  
		al1.add("p");  
		  //Traversing elements  
		  Iterator<String> itr1=al1.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }  

		  //=====================================================
		  
		  
		  
		  
		  Map<Integer, String> HMap = new HashMap<>();
		  
		  HMap.put(null, "a1");
		  HMap.put(303, "b1");
		  HMap.put(404, "c1");
		  HMap.put(500, "d1");
		   
		  System.out.println(HMap);
		  
		  System.out.println();
		  Map<String, String> LHMap = new LinkedHashMap<>();
		  
		  LHMap.put("11", "Tom");
		  LHMap.put("12", "Peter");
		  LHMap.put("10", "Mary");
		  LHMap.put("14", "John");
		   
		  System.out.println(LHMap);
		  
		  System.out.println();
		  
		  
		  Map<String, String> TMap = new TreeMap<>();
		  
		  TMap.put("name", "Somnath");
		  TMap.put("city", "Alabama");
		  TMap.put("state", "Alabama");
		  TMap.put("country", "USA");
		   
		  System.out.println();
		  
		  System.out.println(TMap);
		  
		  
	}








}
