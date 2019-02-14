package com.servlet;

class Emp1{

	private Integer age;
	
	private String name;;
	
	Emp1(){//no arg constructor replacing default one provided by jvm

	}

	Emp1(Integer age,String name){
		
		age=age;
		name=name;
		
		//with this above code no compile time exception but run it
		
		/*this.age=age;
		this.name=name;
		*/
		//this code resolve the issue using this keyword
		
		
	}
	public void inputData(int age,String name){
		
			age=age;
			name=name;
		
	}
	
	public void outPutData(){
		
		System.out.println(age);
		
		System.out.println(name);
	
}

}






public class keyWordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp1 ob=new Emp1();
		ob.inputData(31,"som");
		ob.outPutData();
		System.out.println("=======");
		

	}

}
