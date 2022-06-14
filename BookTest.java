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
		System.out.println("å ������ ��:"+totalPrice+"��");
		System.out.println("���� �� å ������ ��: "+totalPrice1+"��");
		
//		SQL Plus 50000�� 5%
//		Java 2.0 40000�� 3%
//		JSP Servlet 60000�� 6%
//		
//		å ������ ��: 15000��
//		���ε� å ������ ��:142700.0�� (double)
		

	}
	
}