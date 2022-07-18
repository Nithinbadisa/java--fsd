package kumar;
import java.util.Scanner;

class calc{
	
   int a,b;
   calc(int a, int b){
	   
	   this.a=a;
	   this.b=b;
	}
   
   int add() {return a+b;}
   int sub() {return a-b;}
   int mul() {return a*b;}
   int div() {return a/b;}
 }
   

public class calulator {

	public static void mian (String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	System.out.println("enter the oepration +,-,*,/");
	int z=sc.nextInt();
	int c=0;
	
	calc obj=new calc(a,b);
	switch(z) {
	case'+':
	  c=obj.add();
	  break;
	  
	case'-':
		c=obj.sub();
		break;
		
	case'*':
		c=obj.mul();
		break;
		
	case'/':
		c=obj.div();
		break;
		
	
	}
	
	System.out.println("answer is: "+ a+ z+ b +"="+ c);
	
			
	
	
	}
}

