package Assignment03;
import java.util.Scanner;
public class Assignment03_01 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 0 �̸� "zero" ����̸� "plus �����̸� minus
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("����: ");
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
