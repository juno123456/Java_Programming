package Assignment03;
import java.util.Scanner;
public class Assignment03_03 {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Number? ");
		num = in.nextInt();
		in.close();
		
		if(num == 1) {
			System.out.println("dog");
		}
		else if(num == 2) {
			System.out.println("cat");
		}
		else if(num == 3) {
			System.out.println("chick");
		}
		else {
			System.out.println("I don't know.");
		}
	}

}
