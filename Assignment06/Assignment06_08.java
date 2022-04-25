package Assignment06;
import java.util.Scanner;
public class Assignment06_08 {
// 1 2 3 4 5 6 7 8 
// 1 4 7 8 3 6 9 8
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] first = new int[2][4];
		int[][]second = new int[2][4];
		int[][]mul = new int[2][4];
		System.out.print("first array: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {			
				first[i][j] = in.nextInt(); 
			}
		}
		System.out.print("second array: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				second[i][j] = in.nextInt(); 
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				mul[i][j] = first[i][j]*second[i][j]; 
				System.out.print(mul[i][j]+" "); 
			}
			System.out.println();
		}
		
		
		
		
		
		in.close();
	}

}
