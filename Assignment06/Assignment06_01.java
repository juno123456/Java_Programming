package Assignment06;
import java.util.Scanner;
public class Assignment06_01 {
// 10�� ���� �Է� �޾� 1,4,7 �Է¹��� ���� ���;
// A B C D E F G H I J = A D G
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] range_list = new String[10];
		
		System.out.print("����: ");
		for(int i =0; i < 10; i++) {
			
			range_list[i] = in.next();
		}
		
		for(int i =0; i < 7; i+=3) {
			System.out.print(range_list[i]+" ");
		}
		
		
		
		
		in.close();

	}

}
