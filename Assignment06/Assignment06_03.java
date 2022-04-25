package Assignment06;
import java.util.*;
public class Assignment06_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] avg_list = {0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		double sum = 0;
		
		System.out.print("µÎ ¹Ý: ");
		for(int i = 0; i <2 ; i++) {
			int num = in.nextInt();
			sum+= avg_list[num];
			
		}
		
		System.out.print(sum);
		
		// 85.6 79.5 83.1 80.0 78.2 75.0
		
		
		in.close();
	}

}
