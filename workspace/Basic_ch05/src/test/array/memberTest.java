package test.array;

public class memberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDB db = new MemberDB();
		db.setmembername("전은수");
		db.setmembername("홍길동");
		db.setmembername("이영애");
		db.setmembername("김영희");
		db.setmembername("태후");
		db.setmembername("이브");
		
		db.printnames();
		//--------------------------//
		System.out.println();
		System.out.println(args);
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
		{
			db.setmembername(args[i]);
		}
		db.printnames();
	}

}
