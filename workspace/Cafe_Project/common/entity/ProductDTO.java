package common.entity;

public class ProductDTO {
	
	private String prodCode;
	private String prodName;
	private int price;	
	
	public ProductDTO(String prodCode2, String prodName2, int price2) {
		// TODO Auto-generated constructor stub
	}

	public String getProdCode() {
		return prodCode;
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null) {
			this.prodCode = prodCode;
		} else {
			System.out.println("상품 코드를 반드시 입력하십시오.");
		}
	}
	
	public String getProdName() {
		return prodName;
	}
	
	public void setProdName (String prodName) {
		if(prodName != null) {
			this.prodName = prodName;
		} else {
			System.out.println("상품 이름를 반드시 입력하십시오.");
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price>0) {
			this.price = price;
		}
	}

}
