package Assignment05;
import java.util.Scanner;
public class Assignment05_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�� ��: ");
		int num1 = in.nextInt(), num2 = in.nextInt();
		
		for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
		
		
	 in.close();
	}

}
