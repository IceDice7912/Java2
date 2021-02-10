package test1;

public class MyProfile
{
	String name;
	int age;
	double tall;
	char gender;
	boolean isPretty;
	
	public void setProfile(String name1, int age1, double tall1, char gender1, boolean isPretty1)
	{
		name = name1;
		age = age1;
		tall = tall1;
		gender = gender1;
		isPretty = isPretty1;
	}
	
	public void printProfile()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isPretty);
	}
}
