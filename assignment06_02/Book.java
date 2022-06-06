package assignment06_02;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate; 


	public Book() {
	
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;	
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}	
	public double getDiscountBookPrice() {
		return bookPrice*(1-bookDiscountRate/100);
	}
}