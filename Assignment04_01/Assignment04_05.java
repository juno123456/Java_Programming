package Assignment04_01;
import java.util.Scanner;
public class Assignment04_05 {
	//0�� �Էµɶ����� ������ �Է¹޾� 3�� ����� 5�� ����� ������ ������ ���
	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("�Է��Ͻÿ�");
			num = in.nextInt();
			if((num%3!= 0) && (num%5!= 0)) {//3�� ��� , 5�� ��� ����
				count+=1;
				}
			else if (num == 0) { // 0�� �ԷµǸ� ���α׷� ����
				break;
			}
		}		
		
		System.out.print(count);
	

 }
}
