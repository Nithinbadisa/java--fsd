package classclass;

public class annonyums {
	
public static void main(String[] args) {
		
		Car bmwCustomModel= new Car() {
			public void start() {
				System.out.println("Special Implementaion of start");
			}
			public void stop() {
				System.out.println("Special implementation of stop");
			}
		};
		
		bmwCustomModel.start();
		bmwCustomModel.stop();

}
}