package Assignment05;
import java.util.Scanner;
public class Assignment05_02 {

	public static void main(String[] args) {
		//2부터 9까지 수 중 2개 입력받아 수 사이의 구구단 출력
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