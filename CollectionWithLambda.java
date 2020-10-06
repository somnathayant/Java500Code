package com.ayantsoft.core1.ems;

import java.util.ArrayList;
import java.util.List;

interface i{
	public int add(int a,int b);
}



public class CollectionWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names=new ArrayList();
		
		names.add("som1");
		names.add("som2");
		names.add("som3");
		names.add("som4");
		
		for(String st:names) {
			System.out.println(st);
		}
		
		names.forEach(p->System.out.println(p));
		
		names.forEach(System.out::println);
		
		
		
		
		i obj=(int a,int b)->{
			System.out.println(a+b);
			return (a+b);
		};
		
		i obj1=(int a,int b)->{
			System.out.println(a+b+9);
			return (a+b);
		};
		
		int k=obj1.add(12,34);
		System.out.println(k);

	}

}
