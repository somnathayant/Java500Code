package servlet;

class Th1 extends Thread{
	
	public void run(){
		System.out.print("ok");
	}
	
}

public class ExmpleBasic {

	public static void main(String[] args) {
		
		Th1 ob1=new Th1();
		Th1 ob2=new Th1();
				
		ob1.start();
		ob2.start();
		
		ob1.start();
	}

}
