package Myweapon;

public class Gun extends Show implements Equip {

	String type = "총";
	String data[]= {"총알", "화약"};
//	String use[] = {"발사", "장전"};
	
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("총은 쏘고 장전한다.");
	}

	@Override
	public void Equip() {
		// TODO Auto-generated method stub
		System.out.println("총을 장착합니다.");
	}
	@Override
	public void UnEquip() {
		// TODO Auto-generated method stub
		System.out.println("총을 장착하지 않습니다.");
	}
	@Override
	public void Power(int p) {
		// TODO Auto-generated method stub
		System.out.println("총 장착 후 전투력 : " + p);
	}
	
}
