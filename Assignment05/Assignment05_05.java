package Assignment05;
import java.util.Scanner;
public class Assignment05_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		
		for(int i = n; i>0; i--) {
			for(int j = 0; j< n-i; j++) {
				System.out.print(" ");
			}
			for(int j =i*2; j>1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			

	}

}
