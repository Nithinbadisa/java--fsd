package exceptionhandling;

public class exceptionhandlingdemo1 {
	
public static void main(String[] args) {
		
		
		int a=2;
		int b=1;
		
		
		try {
			int c=a/b;
			System.out.println("Result is: "+c);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);

}
}
}
