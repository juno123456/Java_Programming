package Assignment06;
import java.util.Scanner;
public class Assignment06_02 {

	public static void main(String[] args) {
		// 6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷� �ۼ�
		// ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ���� �Ѵ�
		//	23.2 39.6 66.5 50.0 45.6 48.0  = 45.5
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է�(6��): ");
		double sum = 0;
		double avg, count  = 0 ;
		
		for(int i = 0 ; i<6; i++) {
			double weight = in.nextDouble();
			
			sum += weight;
			count++;
			}
		
		avg = sum/count;
		System.out.printf("%.1f", avg);
		
		in.close();
	}

}
