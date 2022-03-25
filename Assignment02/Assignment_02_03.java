package Lecture_02;

import java.util.Scanner;

public class Assignment_02_03 {

	public static void main(String[] args) {
		int a , b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("");
		a= input.nextInt();
		b= input.nextInt();
		a = ++a;
		b= --b;
		
		System.out.println(a+" "+b+" "+ (a*b));

	}

}
