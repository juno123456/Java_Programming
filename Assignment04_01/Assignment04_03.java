package Assignment04_01;
import java.util.Scanner;
public class Assignment04_03 {
	//�� ���� �ڿ����� �Է¹޾� �� ���� ����� ���ʷ� 10�� ����ϴ� ���α׷� �ۼ�
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ڿ��� �Է�: ");
		int num = in.nextInt();
		
		for(int i =1 ; i<=10 ; i++) {
			
			System.out.print(num*i+ " ");
		}
	}

}
