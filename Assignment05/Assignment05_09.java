package Assignment05;
import java.util.Scanner;
public class Assignment05_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		int num  = 1;
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(num+ " ");
				num+=2;
				if(num >10) {
					num =1;
				}
			}
			System.out.println();
		}
	}

}
