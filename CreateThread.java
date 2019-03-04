package servlet;

class Thr1  implements Runnable {
	
	public void run(){
		System.out.println("=====1");
	}
}

class Thr2 extends Thread{
	
	public void run(){
		System.out.println("=====2");
	}
}
class A11{
	
	
}
public class CreateThread {

	public static void main(String[] args){
		
		  Thr1 mt1 = new Thr1();
		  
		  Thread t = new Thread(mt1);
		  t.start();
		  
		  Thr2 t2=new Thr2();
		  t2.start();
		  
		  
	}
	
}
