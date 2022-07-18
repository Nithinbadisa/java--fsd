package kumar;
import java.util.Scanner;
public class nithin {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your percentage");
		
		int p=sc.nextInt();
	
	if(p>=70 && p<=100)
		System.out.println("first grade");
	else if(p>=60 && p<=70)
		System.out.println("seconf grade");
	else if(p>=35 &&p<60)
		System.out.println("just pass");
	else
		System.out.println("fail");
	
	System.out.println("enter correct percentage");
	
	 
	
	}
	
	

}
