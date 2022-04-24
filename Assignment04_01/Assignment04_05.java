package Assignment04_01;
import java.util.Scanner;
public class Assignment04_05 {
	//0이 입력될때까지 정수를 입력받아 3의 배수와 5의 배수를 제외한 개수를 출력
	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력하시오");
			num = in.nextInt();
			if((num%3!= 0) && (num%5!= 0)) {//3의 배수 , 5의 배수 제외
				count+=1;
				}
			else if (num == 0) { // 0이 입력되면 프로그램 종료
				break;
			}
		}		
		
		System.out.print(count);
	

 }
}
