package Assignment05;
import java.util.Scanner;
public class Assignment05_06 {
// 1���� 100������ ���� �Ѱ��� �Է¹޾� 100���� ���� ����餷�� ���ʷ� ����ϴ� 10�� ����� ��µǸ� ����
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("100������ ����:");
		int num = in.nextInt();
		
		for(int i=num; i<100 ; i+=num) {
			System.out.print(i+" ");
			if(i%10==0) {
				break;
			}
		}
		
		in.close();

	}

}
