package Assignment06;
import java.util.Scanner;
public class Assignment06_06 {
// 5 10 8 55 6 31 12 24 61 2   10���� �Է� �� ���� ���� �� ���
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]list = new int[10];
		
		
		System.out.print("����(1000�̸�): ");
		for(int i=0; i<10; i++) {
			int num = in.nextInt();
			if(num<1000) {
				list[i] = num;
			}
			else {
				i--;
				System.out.print("����(1000�̸�): ");
				continue;
			}
		}
		int min = list[0];
		for(int i=0; i<list.length; i++) {
			if(min > list[i]) {
				min = list[i];
			}
		}
		
		System.out.print(min);
		
		in.close();
	}

}
