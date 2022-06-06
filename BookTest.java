package assignment06_02;

public class BookTest {

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		
		// Book 객체를 3개 생성하여 배열에 넣는다
		bookArray [0] = new Book("SQL Plus", 50000, 5.0);
		bookArray [1] = new Book("Java 2.0", 40000, 3.0);
		bookArray [2] = new Book("JSP Servlet", 60000, 6.0);
		
		// 배열에 있는 객체 정보를 모두 출력 한다 – for loop를 이용 할 것
		for (int i=0; i<bookArray.length; i++) {
		    System.out.print(bookArray[i].getBookName() + " ");
		    System.out.print(bookArray[i].getBookPrice() + "원 ");
			System.out.println((int)bookArray[i].getBookDiscountRate() + "%");
		}
		
		//책 가격의 합을 출력 한다
		int sum = bookArray[0].getBookPrice() + bookArray[1].getBookPrice() + bookArray[2].getBookPrice();
		System.out.println("\n책 가격의 합: "+ sum  +"원");
		
		// 할인 된 책 가격의 합을 출력 한다
		double discountedSum = bookArray[0].getDiscountBookPrice() + bookArray[1].getDiscountBookPrice() + bookArray[2].getDiscountBookPrice();
		System.out.print("할인 된 책 가격의 합: " + discountedSum + "원");
	}
}
