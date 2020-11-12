package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		/* 내가 짠 코드
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A등급");
		}else if(score>=80) {
			System.out.println("B등급");
		}else if(score>=70) {
			System.out.println("c등급");
		}else if(score>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		*/
		
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}else if(90>point&&point>=80) {
			System.out.println("B등급");
		}else if(80>point&&point>=70) {
			System.out.println("C등급");
		}else if(70>point&&point>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		
		
		sc.close();
	}
}
