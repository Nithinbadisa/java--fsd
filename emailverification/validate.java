package emailverification;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class validate {

	
	public static void main(String[] args) {
		
		String regex = "[a-zA-z][|\\w-]{1,20}@\\w{2,20}||.||w{2,3}$";
		String email = "3abc123@gmail.com";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(email);
		
		if(match.matches()) {
			
		System.out.println("password is correct");
		
		}
		else {
			System.out.println("password is incorrect");
		}
	
		
		
		
	}
}
