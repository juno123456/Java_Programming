package Assignment04_01;
import java.util.Scanner;
public class Assignment04_02 {
	//100������ ������ �Է¹޾� �������� 100���� ���� ���
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("100������ ������ �Է�: ");
		int num = in.nextInt();
		int sum = 0;
		for(int i = num; i <= 100 ; i++) {
			sum +=i;
		
		}
		System.out.println(sum);
	}	

}
