package string;

public class methods {
	
	public static void main(String[] args) {
		 String x = new String("Nithin kumar");
		 
		 char c= x.charAt(2);
		 System.out.println("Character at index 2: "+c);
		 
		 System.out.println("Length: "+x.length());
		 
		 //uppercase
		 System.out.println("UPPER CASE: "+x.toUpperCase());
		 //lowercase
		 System.out.println("lowercase: "+x.toLowerCase());
		 //check the word 
		 System.out.println("Check the String contains word : world or not? : "+x.contains("World"));
		 //sub string 
		 System.out.println("SubString between 6 to 10 characters: "+x.substring(6,10));
		 
		 String result[]= x.split(" ");
		 
		 for(String s: result) {
			 System.out.println(s);
		 }
		 
		 //comparison
		 
		 String s2= "hello world";
		 //case of equal
		 if(x.equals(s2)) {
			 System.out.println("Validated");
		 }
		 else {
			 System.out.println("Not Valid");
		 }
		 //case of equal ignorecase
		 if(x.equalsIgnoreCase(s2)) {
			 System.out.println("Validated");
		 }
		 else {
			 System.out.println("Not Valid");
		 }
		 //comparison using ==
		 if(x==s2) {
			 System.out.println("Validated");
		 }
		 else {
			 System.out.println("Not Valid");
		 }
		 
	}

}
