package arrayrottion;

public class arrayrotationdemo {
	
public static void main(String[] args) {
		
	main r= new main();
		
		int arr[]= {1,2,3,4,5,6,7};
		
		
		r.rotate(arr, 9); ///passing array and number of  times to  rotate an array
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}



}
