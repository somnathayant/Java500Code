package servlet;

class Th11 extends Thread{
	
	public void run()
   	{
       		System.out.println("r1 ");
       		try {
        		Thread.sleep(5000);
    		}catch(InterruptedException ie){ }
       		System.out.println("r2 ");
  	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Th11 t1=new Th11();
		Th11 t2=new Th11();
		t1.start();

		try{
			t1.join();	//Waiting for t1 to finish
		}catch(InterruptedException ie){}

		t2.start();
	}

}
