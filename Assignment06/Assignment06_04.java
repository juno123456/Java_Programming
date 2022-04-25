package Assignment06;
import java.util.Scanner;
public class Assignment06_04 {
// 95 100 88 65 76 89 58 93 77 99
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num_list = new int[10];
		int sum1 = 0;
		double sum2 = 0;
		double avg = 0;
		double count = 0;
		System.out.print("Á¤¼ö : ");
		for(int i = 0 ; i<10; i++) {
			num_list[i] = in.nextInt();
			if((i+1)%2 == 0) {
				sum1+= num_list[i];
			}
			else {
				sum2 += num_list[i];
				count++;
			}
		}
		
		avg = sum2/count;
		System.out.println("sum: "+sum1+"\n"+"avg: "+avg);

	}

}
