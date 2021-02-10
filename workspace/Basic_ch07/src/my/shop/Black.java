package my.shop;

public class Black extends Customer {
	
	@Override
	public void calcPoint() {
		System.out.println("100p 감소되었습니다.");
	}

}
