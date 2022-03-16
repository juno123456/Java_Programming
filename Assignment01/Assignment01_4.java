package Assignment01;
import java.util.Scanner;
public class Assignment01_4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z, sum, avg;
		
		System.out.print(" ");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		sum = x + y + z;
		avg= sum/3;
		System.out.println("sum = "+sum+"\navg = "+avg+"");
	}
}
