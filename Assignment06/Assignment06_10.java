package Assignment06;
import java.util.Scanner;
public class Assignment06_10 {
// 16 27 39 100 19 88 61 20
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] list = new int [4][2];
		int sum = 0, count = 1;
		int avg_sum = 0;
		int all_sum = 0;
		
		
		System.out.print("number: ");
		for(int i = 0; i<4; i++) {
			for(int j=0; j<2; j++) {
				list[i][j] = in.nextInt();
				all_sum += list[i][j];
			}
			count++;
		}
		System.out.println();
		
		for(int i = 0; i < list.length; i++) {
			sum = 0;
			for(int j = 0; j < list[i].length; j ++) {
				sum += list[i][j];
			}
			System.out.print(sum/2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i<list[i].length; i++) {
			sum = 0;
			for(int j= 0; j < list.length; j++) {
				sum += list[j][i];
			}
			System.out.print(sum/4 + " ");
		}
		System.out.println();
		System.out.println(all_sum/8);
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0; i<4; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(list[i][j]+ " "); 
//			}
//			System.out.println();
//		}
		
		
		
		
		
		in.close();
	}

}
