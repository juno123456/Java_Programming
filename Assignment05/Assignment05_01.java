package Assignment05;
import java.util.Scanner;
public class Assignment05_01 {

	public static void main(String[] args) {
		//�ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���� 
        //���� n�̻��̸� Ȧ���� ������ ���� ���
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 1 ; i< n ; i+=2  ) {
			sum = sum + i;
			count = count +1;
			if(n <= sum) {
				break;
			}
		}
		
		System.out.print(count+" "+sum );
		
		
		
		in.close();
	}

}
