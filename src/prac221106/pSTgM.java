package prac221106;

public class pSTgM {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(1);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메세지:"+ae.getMessage());
		}
		System.out.println(6);
		


	}

}
