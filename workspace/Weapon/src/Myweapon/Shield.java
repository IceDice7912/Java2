package Myweapon;

public class Shield extends Show implements Equip {
	
	String type = "방패";
	String data[]= {"합금", "플라스틱"};
//	String use[] = {"막기", "던지기"};

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("방패는 막고 던진다.");
	}
	
	@Override
	public void Equip() {
		// TODO Auto-generated method stub
		System.out.println("방패를 장착합니다.");
	}
	@Override
	public void UnEquip() {
		// TODO Auto-generated method stub
		System.out.println("방패를 장착하지 않습니다.");
	}
	@Override
	public void Power(int p) {
		// TODO Auto-generated method stub
		System.out.println("방패 장착 후 전투력 : " + p);
	}
}
