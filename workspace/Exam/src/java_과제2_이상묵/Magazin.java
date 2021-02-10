package java_과제2_이상묵;

public class Magazin{
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;
	
	public Magazin(String isbn, String title, String author, String publisher, int price, String desc, int year, int month) {
		try {
			Integer.parseInt(isbn);
			if(Integer.parseInt(isbn) > 0) {
				this.isbn = isbn;	
			} else {
				this.isbn = "Error";
			}
		} catch (NumberFormatException e) {	
			this.isbn = "Error";
		}
		
		if (title != null) {
		this.title=title;
		} else {
			this.title= "Error";
		}
		
		if (author != null) {
		this.author=author;
		} else {
			this.author= "Error";
		}
		
		if (publisher != null) {
		this.publisher=publisher;
		} else {
			this.publisher= "Error";
		}
		
		if(price > 0) {
			this.price=price;
		} else {
			this.price = 0;
		}
		
		if (desc != null) {
			this.desc=desc;
		} else {
			this.desc = "Error";
		}
		
		if (year > 0) {
			this.year=year;
		} else {
			this.year = 0;
		}
		
		if (month > 0) {
			this.month=month;
		} else {
			this.month = 0;
		}

	}


	


	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getPublisher() {
		return publisher;
	}




	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}




	public int getMonth() {
		return month;
	}




	public void setMonth(int month) {
		this.month = month;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getDesc() {
		return desc;
	}




	public void setDesc(String desc) {
		this.desc = desc;
	}




	@Override
	public String toString() {
		return (this.isbn+"\t|\t"+this.title+"\t|\t"+this.author+"\t|\t"+this.publisher+"\t|\t"+this.price+"\t|\t"+this.desc+"\t|\t"+this.year+"."+this.month);
		}
}
