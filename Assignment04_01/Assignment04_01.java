package Assignment04_01;
import java.util.Scanner;
public class Assignment04_01 {

	public static void main(String[] args) {
		//100������ ���� ������ �Էµȴ�.
		//while ���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ���
		Scanner input = new Scanner(System.in);
		int num;
		int i =1;
		int sum=0;
		do {
			System.out.print("100������ ���� ����:  ");
			num = input.nextInt();
		
			}while(num < 0 || num>101);
		
		while(i<num+1) {
			sum = sum+i;
			i++;
			}
		System.out.println(sum);
	}

}
