package Assignment04_01;
import java.util.Scanner;
public class Assignment04_01 {

	public static void main(String[] args) {
		//100이하의 양의 정수만 입력된다.
		//while 문의 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력
		Scanner input = new Scanner(System.in);
		int num;
		int i =1;
		int sum=0;
		do {
			System.out.print("100이하의 양의 정수:  ");
			num = input.nextInt();
		
			}while(num < 0 || num>101);
		
		while(i<num+1) {
			sum = sum+i;
			i++;
			}
		System.out.println(sum);
	}

}
