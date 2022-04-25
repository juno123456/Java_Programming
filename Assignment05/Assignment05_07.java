package Assignment05;
import java.util.Scanner;
public class Assignment05_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
	
		for (int i = 0; i < n; i++) { 
			for (int j = n-i; j >=1; j--) { 
				 System.out.print("  ");			
			}
			for(int a=1; a<=i+1; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	       
	}
}


