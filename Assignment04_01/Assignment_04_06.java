package Assignment04_01;
import java.util.*;
public class Assignment_04_06 {

	public static void main(String[] args) {
		
		// �ﰢ���� �غ� , ����  2�� �Է¹޾� ���� ���
		//	continue ���� Y,y�̸� �ݺ� �ƴϸ� 
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
