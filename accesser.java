package nithinkumar;
import java.util.Scanner;
public class accesser {
	
    public static void main(String [] args) {
    	
    	int a;
    	int x;
    	int y;
    	int z;
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("1: addition");
    	System.out.println("2: subtraction");
    	System.out.println("3: multiplicatio");
    	System.out.println("4: division");
    	a=sc.nextInt();
    	
    	if (a==1) {
    		System.out.println("enter yotu first number");
    		x=sc.nextInt();
    		System.out.println("enter your second number");
    		y=sc.nextInt();
    		z=x+y;
    		System.out.println("yourt answer is: "+z);
    	}
    	
    	if (a==2) {
    		System.out.println("enter yotu first number");
    		x=sc.nextInt();
    		System.out.println("enter your second number");
    		y=sc.nextInt();
    		z=x-y;
    		System.out.println("yourt answer is: "+z);
    	}
    	
    	if (a==3) {
    		System.out.println("enter yotu first number");
    		x=sc.nextInt();
    		System.out.println("enter your second number");
    		y=sc.nextInt();
    		z=x*y;
    		System.out.println("yourt answer is: "+z);
    	}
    	
    	if (a==4) {
    		System.out.println("enter yotu first number");
    		x=sc.nextInt();
    		System.out.println("enter your second number");
    		y=sc.nextInt();
    		z=x/y;
    		System.out.println("yourt answer is: "+z);
    	}
    	
    	
   }
    
}
    
