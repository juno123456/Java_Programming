package Assignment03;

import java.util.Scanner;

public class Assignment03_02 {

	public static void main(String[] args) {
		//���� �빮�ڸ� �Է¹޾� A : Excellent B: Good C:Usually 
		//D: Effort F: Failure ������ error
		String a;
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		a = in.nextLine();
		String b;
		switch(a) {
		case "A":
			b = "Excellent";
			break;
		case "B":
			b = "Good";
			break;
		case "C":
			b = "Usually";
			break;
		case "D":
			b = "Effort";
			break;
		case "F":
			b = "Failure";
			break;
		default:
			b = "Error";
			break;
		}
		
		System.out.println(b);
		
	}
	

}
