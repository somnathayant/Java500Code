package com.codersdata.corejava.logic.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Employe>eList=new ArrayList<Employe>();
		
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		Employe e4=new Employe();
		
		e1.setId(10);
		e1.setName("chris");
		e1.setSalary(5000);
	
		e2.setId(11);
		e2.setName("Stella");
		e2.setSalary(6000);
		
		e3.setId(12);
		e3.setName("somnath");
		e3.setSalary(4000);
		
		e4.setId(13);
		e4.setName("navin");
		e4.setSalary(7000);
		
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		
		
		List<Employe>eListAfterFilter=eList.stream().filter(obj->obj.id<12).collect(Collectors.toList());
		
		List<String>eListAfterFilter1=eList.stream().map(obj->obj.name.toUpperCase()).collect(Collectors.toList());
		
		
		
		for(String e:eListAfterFilter1) {
			System.out.println(e);
		}
		
	}

}
