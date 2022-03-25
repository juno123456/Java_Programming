package Lecture_02;

import java.util.Scanner;

public class Assignment_02_01 {

	public static void main(String[] args) {
		int a , b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("");
		a= input.nextInt();
		b= input.nextInt();
		
		System.out.println(a+ ">" +b+ "---"+ (a>b ? 1:0));
		System.out.println(a+ "<" +b+ "---"+ (a<b ? 1:0));
		System.out.println(a+ ">=" +b+ "---"+(a>=b ? 1:0));
		System.out.println(a+ "<=" +b+ "---"+(a<=b ? 1:0));

	}

}
