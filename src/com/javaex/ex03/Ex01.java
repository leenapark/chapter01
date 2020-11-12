package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수: ");
		
		int point = sc.nextInt();
		
		if(point>=60) {
			//위 조건식의 값이 true면 {} 안쪽 식이 적용된다
			System.out.println("합격입니다");
			
		}
		
		
		sc.close();
	}
}
