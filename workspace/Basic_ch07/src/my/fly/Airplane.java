package my.fly;

import javafx.scene.effect.Light.Distant;

public class Airplane extends Vehicle implements Flyer {
	
	public void flight () {
		int distance = transfer(10, 1000);
		System.out.println("비행기가 날아간 거리 : "+ distance + "만큼 날아갔다.");
	}
	
	@override
	public void fly() {
		fly();
	}
}
