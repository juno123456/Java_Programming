package Assignment04_01;
import java.util.Scanner;
public class Assignment04_03 {
	//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램 작성
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("자연수 입력: ");
		int num = in.nextInt();
		
		for(int i =1 ; i<=10 ; i++) {
			
			System.out.print(num*i+ " ");
		}
	}

}
