package Exam2;

import java.util.Date;

public class StudentDTO {
	
	private int No=3;
	private String name="나길동";
	private String det="영문학과";
	private String addr="제주";
	private String tel="010-3333-3333";
	
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(int No, String name, String det, String addr, String tel) {
		super();
		setNo(No);
		setname(name);
		setdet(det);
		setaddr(addr);
		settel(tel);
	}
	
	
	public int getNo() {
		return No;
	}
	public void setNo(int No) {
		if((Integer.toString(No) != null)) {
			this.No = No;
		}else {
			System.out.println("No는 null이 될 수 없습니다");
			System.exit(0);
		}
	}
	
	//No만 not null 설정이고 나머지는 그런거 없어서, 그리고 타입도 String 타입이라서 유효성 검사는 하지 않았습니다.
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getdet() {
		return det;
	}
	public void setdet(String det) {
		this.det = det;
	}
	public String getaddr() {
		return addr;
	}
	public void setaddr(String addr) {
		this.addr = addr;
	}
	public String gettel() {
		return tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}

}
