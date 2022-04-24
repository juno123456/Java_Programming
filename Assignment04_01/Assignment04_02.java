package Assignment04_01;
import java.util.Scanner;
public class Assignment04_02 {
	//100이하의 정수를 입력받아 정수부터 100까지 합을 출력
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("100이하의 정수를 입력: ");
		int num = in.nextInt();
		int sum = 0;
		for(int i = num; i <= 100 ; i++) {
			sum +=i;
		
		}
		System.out.println(sum);
	}	

}
