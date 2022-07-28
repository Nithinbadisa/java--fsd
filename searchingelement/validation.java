package searchingelement;

import java.util.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class validation {
	
	
 public static void main(String[] args)
 {
	
	 ArrayList<String> emailids = new ArrayList<String>();
	 
	 emailids.add("nithinkumar@gmail.com");
	 emailids.add("kumarbadisa19@gmail.com");
	 emailids.add("badisa159@gmail.com");
	 emailids.add("lokeshwar998@hotmail.com");
	 emailids.add("badisanit@hotmail.com");
	 emailids.add("b.sambasiva@yahoo.com");
	 emailids.add("usharani@yahoo.com");
	 emailids.add("badllb@yahoo.com");
	 emailids.add("eswar3@yahoo.com");

	 
	 String searchElement;
	 System.out.println("Enter E-mail ID here: ");
	 
	 Scanner emailid = new Scanner(System.in);
	 searchElement = emailid.nextLine();
	 
	 String regex = "^(.+)@(.+)$";
	 Matcher matcher = Pattern.compile(regex).matcher(searchElement);
	 
	 if (matcher.matches() && emailids.stream().anyMatch(mail -> 
	mail.equals(searchElement))) {
	 System.out.println(searchElement + " = E-mail ID found");
	 } else {
	 System.out.println("E-mail ID not found.Please recheck");
	 }
	 }
	}


