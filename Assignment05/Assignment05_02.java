package Assignment05;
import java.util.Scanner;
public class Assignment05_02 {

	public static void main(String[] args) {
		//2���� 9���� �� �� 2�� �Է¹޾� �� ������ ������ ���
		  Scanner in = new Scanner(System.in);
		  System.out.print("Numbers : ");
		  int num1 = in.nextInt(), num2 = in.nextInt();
		 
		  if(num1 >= num2) {
			  for(int i=1; i<10; i++) {
				  for(int j=num1; j >=num2; j--) {
					  System.out.print(j + "X"+i+"="+j*i+"  ");
				  }
				  System.out.println();
			  }
		  }
		  else {
				for (int i = 1; i < 10; i++) {
					for (int j = num1 ; j <= num2; j++) {
						System.out.print(j+"X"+i+"="+j*i+" ");
					}
					System.out.println();
				}
			}
		 
		 in.close(); 
	}
}