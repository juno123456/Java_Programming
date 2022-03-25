package Lecture_02;

import java.util.Scanner;

public class Assignment_02_02 {

	public static void main(String[] args) {
		int a , b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("");
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		
        System.out.println(a>b && a>c? 1:0);
        System.out.println(a==b && b==c? 1:0);
	}

}
