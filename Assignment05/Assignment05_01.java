package Assignment05;
import java.util.Scanner;
public class Assignment05_01 {

	public static void main(String[] args) {
		//자연수 n을 입력받고 1부터 홀수를 차례대로 더해 
        //합이 n이상이면 홀수의 개수와 그합 출력
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 1 ; i< n ; i+=2  ) {
			sum = sum + i;
			count = count +1;
			if(n <= sum) {
				break;
			}
		}
		
		System.out.print(count+" "+sum );
		
		
		
		in.close();
	}

}
