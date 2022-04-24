package Assignment04_01;
import java.util.*;
public class Assignment_04_06 {

	public static void main(String[] args) {
		
		// 삼각형의 밑변 , 높이  2개 입력받아 넓이 출력
		//	continue 에서 Y,y이면 반복 아니면 
		// (base*height)/2
		Scanner in = new Scanner(System.in);
		double base, height, width ;
		String q;
		while(true)
		{
			 System.out.print("base = ");
			 base = in.nextInt();
			 System.out.print("Height = ");
			 height = in.nextInt();
			 width = (base * height)/2;
			 System.out.println("Triangle width ="+ width);
			 
			 System.out.println("Continue? ");
			 q = in.next();
		
			if(q.equals("Y")) {
				
			}
			 
			else{
					break;
			}
		}
		
//		System.out.println(base);
//		System.out.println(height);

		
		
		in.close();
	}
		
}
