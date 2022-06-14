package Book;
import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Book bookArray [] = new Book[3];
		
		bookArray[0] = new Book("SQL Plus", 0, 5);
		bookArray[1] = new Book("Java 2.0", 0, 3);
		bookArray[2] = new Book("JSP Servlet", 0, 6);
		
		bookArray[0].setbookPrice(50000);
		bookArray[1].setbookPrice(40000);
		bookArray[2].setbookPrice(60000);
		
		for(int i=0; i<3; i++) {
			System.out.println(bookArray[i]);
		}
		
		int totalPrice=0;
		for(int i=0; i<3; i++) {
			totalPrice = totalPrice+ bookArray[i].getbookPrice();
		}
		
		double totalPrice1 =0;
		for(int i=0; i<3; i++) {
			totalPrice1 = totalPrice1+ bookArray[i].getDiscountBookPrice();
		}
		System.out.println("책 가격의 합:"+totalPrice+"원");
		System.out.println("할인 된 책 가격의 합: "+totalPrice1+"원");
		
//		SQL Plus 50000원 5%
//		Java 2.0 40000원 3%
//		JSP Servlet 60000원 6%
//		
//		책 가격의 합: 15000원
//		할인된 책 가격의 합:142700.0원 (double)
		

	}
	
}