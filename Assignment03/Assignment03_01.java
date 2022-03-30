package Assignment03;
import java.util.Scanner;
public class Assignment03_01 {

	public static void main(String[] args) {
		// 정수를 입력받아 0 이면 "zero" 양수이면 "plus 음수이면 minus
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("정수: ");
		num = in.nextInt();
		in.close();
		
		if(num > 0) {
			System.out.println("plus");
		}
		else if(num < 0) {
			System.out.println("minus");
		}
		else {
			System.out.println(0);
		}
	}

}
