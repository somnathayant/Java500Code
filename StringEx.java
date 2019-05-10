package servlet;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="somnath1";
		String st1="somnath";
		
		
		String st2=new String("java");
		String st3=new String("java");
		
		if(st==st1){
			System.out.println("======");
		}
		if(st.equals(st1)){
			System.out.println("======1");
		}
		/*if(st2==st3){
			System.out.println("oooooo");
		}*/
		
		if(st2.equalsIgnoreCase(st3)){
			System.out.println("[[[[[");
		}
	}

}
