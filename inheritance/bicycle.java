package inheritance;

public class bicycle {
	private int gear;
	private int speed;
	
	
	public bicycle(int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
	}
	
	
	//method to decrease a speed
	public void  applyBreaks(int decrement) {
		speed = --decrement;
	}
	
	//method to increase a speed
	public  void speedUp(int increament) {
		speed= ++ increament;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Bicycle [No of gear=" + gear + ", speed of bike=" + speed + "]";
	}
	
	
	public static void main (String[] args) {
		System.out.println("bicycle details are updated");
	}
	
	


}
