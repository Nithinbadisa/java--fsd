package methods;

public class methodoverload {
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	float add(float a, float b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
		 
	}
	
	
	public static void main(String[] args) {
		
		methodoverload x= new methodoverload();
		System.out.println("addition of 55 and 34 is: "+x.add(55, 34));
		System.out.println("addition of three numbers is: "+x.add(55, 44, 54));
		System.out.println("addtion of two float is: "+x.add(20.02, 20.53));
		System.out.println("addition of two double is: "+x.add(88.24, 55.23));
		
	}

}
