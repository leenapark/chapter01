package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		/*내가 짠 코드
		int score = sc.nextInt();
		
		if(score % 3 == 0) {
			System.out.println(score+"는(은) 3의 배수입니다");
		}else {
			System.out.println(score+" 는(은) 3의 배수가 아닙니다");
		}
		*/
		
		int point = sc.nextInt();
		
		if(point%3==0) {
			System.out.println(point+"는(은) 3의 배수입니다");	
		} else {
			System.out.println(point+"는(은) 3의 배수가 아닙니다");
		}
		
		sc.close();
	}
}
