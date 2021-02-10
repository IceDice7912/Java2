package test_encapsulation;

public class MyProfile {
	String name="전은수";
	MyDate birthday=new MyDate();
	
	public void setBirthday()	{
		birthday.setYear(1996);
		birthday.setMonth(10);
		birthday.setDay(25);
		
		System.out.println(birthday.getYear()+"년\n"+birthday.getMonth()+"월\n"+birthday.getDay()+"일\n");
	}
	
	
}
