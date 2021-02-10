package test_generic2;

import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat();
		AnimalList<LandAnimal> zoo=new AnimalList();
		zoo.add(cat);
		
		AnimalList<WaterAnimal> zoo2 = new AnimalList();
		Fish fish = new Fish();
		zoo2.add(fish);

		AnimalList.cryingAnimalList(zoo);
	}
}

class AnimalList<T> {
	ArrayList<T> al =new ArrayList<T>();//빈상자
	static public void cryingAnimalList(AnimalList<? extends LandAnimal> al) {//모든 동물을 울게
		LandAnimal la = al.get(0);
		al.crying();
	}
	
	private void crying() {
		// TODO Auto-generated method stub
	}
	
	public void add(T o) {//동물 추가
		al.add(o);
	}
	public T get(int index){//동물 리턴
		return al.get(index);
	}
	public void remove() {//동물 삭제
		
	}
}

class WaterAnimal {
	public void swim() {
		System.out.println("수중동물");
	}
}
class Fish extends WaterAnimal{
	@Override
	public void swim() {
		System.out.println("지느러미를 움직임");
	}
}

class LandAnimal{
	public void crying() {
		System.out.println("육지동물");
	}
}
class Cat extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}
class Dog extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("멍멍");
	}
}
class Sparrow extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("짹짹");
	}
}
