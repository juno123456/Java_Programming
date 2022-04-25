package Assignment05;
import java.util.Scanner;
public class Assignment05_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ÀÚ¿¬¼ö: ");
		int num =  in.nextInt();
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		in.close();

	}

}
