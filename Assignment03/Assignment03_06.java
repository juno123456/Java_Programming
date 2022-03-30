package Assignment03;
import java.util.Scanner;
public class Assignment03_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("year: ");
		int year = in.nextInt();
		
//		System.out.println(year);
		
		in.close();
		
		if(year%4 ==0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
	}

}
