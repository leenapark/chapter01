package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		
		/*
		int i = 1;
		
		int table = sc.nextInt();
		//int multy = table * i;

		while(i<=9) {
			System.out.println(table+" * "+i+" = "+(table*i));
			
			i++;
		}
		*/
		
		int dan = sc.nextInt();
		int i = 1;
		
		while(i<=9) { //i<10
			System.out.println(dan+" * "+ i +" = "+dan*i);
			
			i++;
		}
		sc.close();
	}
}
