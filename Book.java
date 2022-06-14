package Book;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		bookName = " ";
		bookPrice = 0;
		bookDiscountRate = 0.0;
	}
	
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
			this.bookName = bookName;
			this.bookPrice = bookPrice;
			this.bookDiscountRate = bookDiscountRate;
	}
	public String getbookName() {
		return bookName;
	}
	public void setbookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getbookPrice() {
		return bookPrice;
	}
	public double getDiscountBookPrice() {
		//bookPrice
		 double price = bookPrice - bookPrice *bookDiscountRate/100;
		 return  price;
	}


	@Override
	public String toString() {
		return   bookName +" "+ bookPrice +"¿ø"+" "+ bookDiscountRate+"%";
				
	}
	
	//setbookPrice,  getBookPrice, getDiscountBookprice 

//	public void setBookPrice(){
//		
//	}
//	public int getBookPrice() {
//		
//	}
//	public double getDiscountBookPrice() {
//		
//	}
}
