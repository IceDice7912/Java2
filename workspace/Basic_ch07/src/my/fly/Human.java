package my.fly;

public class Human extends Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("인간은 밥을 먹고 산다.");
	}
	
	public void walk() {
		System.out.println("인간은 두 다리로 걸어다닌다.");
	}
}
