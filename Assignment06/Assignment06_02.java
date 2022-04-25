package Assignment06;
import java.util.Scanner;
public class Assignment06_02 {

	public static void main(String[] args) {
		// 6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램 작성
		// 출력은 반올림하여 소수 첫째자리까리로 한다
		//	23.2 39.6 66.5 50.0 45.6 48.0  = 45.5
		Scanner in = new Scanner(System.in);
		System.out.print("몸무게 입력(6명): ");
		double sum = 0;
		double avg, count  = 0 ;
		
		for(int i = 0 ; i<6; i++) {
			double weight = in.nextDouble();
			
			sum += weight;
			count++;
			}
		
		avg = sum/count;
		System.out.printf("%.1f", avg);
		
		in.close();
	}

}
