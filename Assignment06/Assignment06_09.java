package Assignment06;
import java.util.Scanner;
public class Assignment06_09 {
//  15 2 35 |  33 1 6 | 5 10 19 | 1 8 55 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] group = new int [4][3];
		int[][] sum = new int [4][1];
		for(int i = 0; i<4; i++) {
			System.out.print((i+1)+"class? : ");
			for(int j = 0; j<3; j++) {
				group[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i <4; i++) {
			for(int j = 0; j<3; j++) {
				sum[i][0] += group[i][j];
			}
			System.out.println((i+1)+"class : "+sum[i][0]);
		}
		
		
	
		
	in.close();
	}

}
