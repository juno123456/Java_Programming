package Assignment06;
import java.util.Scanner;
public class Assignment06_05 {
// 3 5 10 55 0
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] list = new int[100];
		int num;
		int count =0;
		System.out.print("정수(0이면 종료): ");
		for(int i=0; i<100; i++) {
			num = in.nextInt();
			if(num ==0) {
				break;
			}	
			list[i] = num;
			count++;	
		}
		for(int j= count-1; j>=0; j--) {
			System.out.print(list[j]+ " ");
		}
		
		
		in.close();
		
	}
  }
