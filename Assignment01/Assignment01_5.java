package Assignment01;
import java.util.Scanner;

public class Assignment01_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x,mul;
		System.out.print("yard?");
		x = in.nextDouble();
		
		mul=x*91.44;
        
		System.out.printf(""+x+"yard = %.1fcm",mul);

	}

}
