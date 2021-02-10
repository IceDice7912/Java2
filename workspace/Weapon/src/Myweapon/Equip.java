package Myweapon;

public interface Equip {
	public int MAX_power=100;
	public int MIN_power=0;
	
	public void Equip();
	public void UnEquip();
	public void Power(int p);
}
