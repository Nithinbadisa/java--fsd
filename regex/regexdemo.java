package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexdemo {
	
	public static void main(String[] args) {
		
		String regex ="[a-z}+";
		String input = "nitin";
		
		Pattern method = Pattern.compile(regex);
		Matcher match = method.matcher(input);
		
		if(match.matches()) {
			
			System.out.println("password matched");
			
		}
		else {
			
		System.out.println("denied");
		}
	}

}
