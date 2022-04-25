package Assignment06;
import java.util.Scanner;
public class Assignment06_07 {
// 10  55 3 63 85 61 85 0
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int count = 1;
		int num = 1;
		int tens = 0;
		int numbers[] = new int[1000];;
		int arr[] = new int[numbers.length];
		
		System.out.print("100 미만: ");
		for(int i=0; i<numbers.length; i++) {
			num = in.nextInt();
			if (num == 0) {
				break;
			}
			else if (num > 0 && num<100) {
				tens = num/10;
				numbers[tens] = tens;
				count++;
				arr[tens]++;
			}
			else {
				i--;
				System.out.print("100 미만:");
				continue;
			}

		}
		for(tens = 0; tens < 10; tens++) {
			if(arr[tens]!=0)
				System.out.println(tens + " : " +arr[tens]);
		}

		in.close();

	}

}
