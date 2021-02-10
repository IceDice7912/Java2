package my.fly;

public class Bird extends Animal implements Flyer{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("새는 벌레를 잡아먹고 산다.");
	}
	
	public void fly() {
		System.out.println("날개를 펄럭이며 난다.");
	}
}
