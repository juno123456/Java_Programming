package Assignment03;

import java.util.Scanner;

public class Assignment03_02 {

	public static void main(String[] args) {
		//영문 대문자를 입력받아 A : Excellent B: Good C:Usually 
		//D: Effort F: Failure 나머지 error
		String a;
		Scanner in = new Scanner(System.in);
		System.out.println("성적을 입력하시오: ");
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
