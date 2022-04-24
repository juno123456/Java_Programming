package Assignment04_01;
import java.util.Scanner;
public class Assignment04_04 {

	public static void main(String[] args) {
		//100이하의 양의 정수만 입력
		//while 문을 이용 1ㅂ퉈 입력받은 합을 구하여 출력
		
		Scanner in = new Scanner(System.in);
		System.out.print("100이하의 양의 정수 입력: ");
		int num = in.nextInt();
		int i =1;
		int sum = 0;
		while(i<=num) {
			sum = sum+i;
			i++;
		}
	System.out.println(sum);

	}

}
