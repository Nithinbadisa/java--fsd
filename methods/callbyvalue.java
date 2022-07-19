package methods;

public class callbyvalue {
	
	int a=25;
	void operation (int a) {
		this.a=a*10/100;
				
	}
	
	public static void main(String[] args) {
		callbyvalue obj =new callbyvalue();
		
		System.out.println("enter the value of a "+obj.a);
		
		obj.operation(100);
		System.out.println("enter teh value of a: " +obj.a);
		
	}

}
