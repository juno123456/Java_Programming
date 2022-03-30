package Assignment03;
import java.util.*;
public class Assignment03_04 {

	public static void main(String[] args) {
//		int[]list1 = {1,3,5,7,8,10,12}; //31
//		int[]list2 = {4,6,9,11};//30
//		int[]list3 = {2};//28
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("월을 입력하시오: ");
		int month = in.nextInt();
		int day = 0;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
		
		}
			System.out.println(day);
	}
}
