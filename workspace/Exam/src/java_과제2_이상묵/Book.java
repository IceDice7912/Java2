package java_과제2_이상묵; //유효성 검사까지 다 했어야한다고 한다.

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;


	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		
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
	return (this.isbn+"\t|\t"+this.title+"\t|\t"+this.author+"\t|\t"+this.publisher+"\t|\t"+this.price+"\t|\t"+this.desc);
	}
}