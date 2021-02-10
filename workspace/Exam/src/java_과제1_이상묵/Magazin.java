package java_과제1_이상묵;

public class Magazin{
	String isbn;
	String title;
	String author;
	String publisher;
	int year;
	int month;
	int price;
	String desc;
	
	@Override
	public String toString() {
		return (this.isbn+"\t|\t"+this.title+"\t|\t"+this.author+"\t|\t"+this.publisher+"\t|\t"+this.price+"\t|\t"+this.desc+"\t|\t"+this.year+"."+this.month);
		}
}
