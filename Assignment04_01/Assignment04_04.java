package Assignment04_01;
import java.util.Scanner;
public class Assignment04_04 {

	public static void main(String[] args) {
		//100������ ���� ������ �Է�
		//while ���� �̿� 1���� �Է¹��� ���� ���Ͽ� ���
		
		Scanner in = new Scanner(System.in);
		System.out.print("100������ ���� ���� �Է�: ");
		int num = in.nextInt();
		int i =1;
		int sum = 0;
		while(i<=num) {
			sum = sum+i;
			i++;
		}
	System.out.println(sum);

	}

}
