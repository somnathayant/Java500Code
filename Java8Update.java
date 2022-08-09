package com.codersdata.corejava.logic.exception;

interface i{
	public Integer sum(Integer s);
}

interface i2{
	public void method1(Integer s);
}

class MethodRef{

	public Integer ex1(Integer value) {

		return value+10;
	}

	public static Integer ex2(Integer value) {
		return value+20;
	}

	MethodRef(){
		
	}
	
	MethodRef(Integer value){
		System.out.println(value+90);
	}
}



public class Java8Update {
	public static void main(String[] args) {

		
		 
		
		/*i impl1=(Integer value)->{
			Integer sum;
			sum= value*15;
			return sum;
		};
		
		i impl2=(Integer value)->{
			Integer sum;
			sum= value+15;
			return sum;
		};
		
		Integer sumOfValue1=impl2.sum(50);

		//Integer sumOfValue=impl1.sum(50);

		System.out.println(sumOfValue1);
*/
		//method reference

		

		
		i impl2=new MethodRef()::ex1;
		
		
		
		Integer sumOfValue1=impl2.sum(50);
		System.out.println(sumOfValue1);

		i impl3=MethodRef::ex2;

		Integer sumOfValue2=impl3.sum(50);
		System.out.println(sumOfValue2);


		i2 impl4=MethodRef::new;

		impl4.method1(10);

	}
}
