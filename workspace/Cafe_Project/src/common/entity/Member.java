package common.entity;

import java.util.Date;

public class Member {
	private String memId;
	private String name;
	private Date mDate;
	private String phone;
	private int point=0;
	
	
	
	
	public Member(String memId, String name, Date mDate, String phone) {
		super();
		this.memId = memId;
		this.name = name;
		this.mDate = mDate;
		this.phone = phone;
		this.point = point;
	}
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "Member [memId=" + memId + ", name=" + name + ", mDate=" + mDate + ", phone=" + phone + ", point="
				+ point + "]";
	}
	
	
}
