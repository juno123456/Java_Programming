package Lecture_02;

import java.util.Scanner;

public class Assignment_02_04 {

	public static void main(String[] args) {
		int a , b, c, d;
		Scanner input = new Scanner(System.in);
		
		System.out.print("¹Î¼ö");
		a= input.nextInt();
		b= input.nextInt();
		
		System.out.print("±â¿µ");
		c= input.nextInt();
		d= input.nextInt();
		
		System.out.println(a>c && b>d? 1:0);
		
	}

}
