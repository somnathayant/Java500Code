package com.ayantsoft.core1.ems;

import java.util.ArrayList;
import java.util.List;

public class StreamEx1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
List<Doctor>docList=new ArrayList();
		Doctor d1=new Doctor("somnath",32,50000);
		Doctor d2=new Doctor("charls",33,60000);
		Doctor d3=new Doctor("kenny",35,80000);
		docList.add(d1);
		docList.add(d2);
		docList.add(d3);
		
		
		
		docList.stream()
		.filter(d->d.getName().startsWith("k"))
		.forEach(p->System.out.println(p.getAge()));
		
		
		
	}

}
