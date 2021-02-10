package my.shop;

public class Guest extends Customer {
	
	@Override
	public void calcPoint() {
		System.out.println("1회 방문했습니다.");
	}

}
