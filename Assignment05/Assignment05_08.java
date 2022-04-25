package Assignment05;
import java.util.Scanner;
public class Assignment05_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int number = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int j=n; j>i; j--) {
				System.out.print(number);
				number+=1;
				
			}
			System.out.println(); 
		}
		
			
		in.close();
	}

}

