package Assignment05;
import java.util.Scanner;
public class Assignment05_06 {
// 1부터 100까지의 정수 한개를 입력받아 100보다 작은 배수들ㅇㄹ 차례로 출력하다 10의 배수가 출력되면 종료
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("100이하의 정수:");
		int num = in.nextInt();
		
		for(int i=num; i<100 ; i+=num) {
			System.out.print(i+" ");
			if(i%10==0) {
				break;
			}
		}
		
		in.close();

	}

}
