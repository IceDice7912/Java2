package Myweapon;

public class Sword extends Show implements Equip {
	
	String type = "검";
	String data[]= {"철", "나무"};
//	String use[] = {"베기", "휘두르기"};

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("검은 베고 휘두른다.");
	}

	@Override
	public void Equip() {
		// TODO Auto-generated method stub
		System.out.println("검을 장착합니다.");
	}
	@Override
	public void UnEquip() {
		// TODO Auto-generated method stub
		System.out.println("검을 장착하지 않습니다.");
	}
	@Override
	public void Power(int p) {
		// TODO Auto-generated method stub
		System.out.println("검 장착 후 전투력 : " + p);
	}

}
