package test.array;

public class MemberDB {
	String membernames[] = new String[10];
	
	public void setmembername(String name)
	{
		for(int i=0; i<membernames.length; i++)
		{
			if(membernames[i]==null)
			{
				membernames[i] = name;
				break;
			}
		}
	}
	
	public void printnames()
	{
		for(int i=0; i<membernames.length; i++)
		{
			System.out.println(membernames[i]);
		}
	}
}
