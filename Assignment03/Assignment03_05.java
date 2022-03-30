package Assignment03;
import java.util.*;
public class Assignment03_05 {

	public static void main(String[] args) {
		String gender;
		int age;
		
		Scanner in = new Scanner(System.in);
		System.out.print("gender n age: ");
		 gender = in.next();
		 age = in.nextInt();
		 in.close();
//		 System.out.println(gender);
//		 System.out.println(age);
//		 M F 18세 이상 이상을 성인 MAN WOMAN BOY GIRL
		
		 if (gender.equals("M") && age >= 18) {
			 System.out.println("MAN");
		 }
		 else if(gender.equals("M") && age < 18) {
			 System.out.println("BOY");
		 }
		 else if(gender.equals("F") && age >= 18) {
			 System.out.println("WOMAN");
		 }
		 else {
			 System.out.println("GIRL");
		 }
		 
		 
	}

}
