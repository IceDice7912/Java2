package my.fly;

public class Car extends Vehicle {
	
	public void drive(String from, String to) {
		int distance = transfer(30, 178);
		System.out.println("차가 달린 거리 : " + distance + "만큼 달렸다.");
	}
}
