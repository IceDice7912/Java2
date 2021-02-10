package test_encapsulation;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public void setYear(int newyear) {
		if(newyear>0 && newyear<2022) {
			year=newyear;
					}
		else {
			System.out.println("잘못된 연도입니다.");
		}
	}
	
	public void setMonth(int newmonth) {
		if(newmonth>0 && newmonth<13) {
		month = newmonth;
			}
		else {
			System.out.println("잘못된 월입니다.");
		}
	}

	public void setDay(int newday) {
		if(newday>0 && newday<32) {
			day = newday;
		}
		else {
			System.out.println("잘못된 일입니다.");
		}
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
