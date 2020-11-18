package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하세요[0이면 종료]");
		int sum=0;
		
		do {
			num = sc.nextInt();
			sum = sum+num; //sum+num의 값이 = 앞의 sum으로 들어감
			System.out.println("합계: " + sum);
		}while(!(num==0));//조건식 다른 표현 --> num!=0
		//맨처음 질문하고 다시 묻는 질문이 같을 때 계속 실행됨 즉 while 조건식이 true일 때 반복 실행됨
		//반복 질문에서 꼭 1번은 물어봐야할 때
		System.out.println("종료");
		
		System.out.println("======같은 출력/다른 식=======");
		//다른 식으로 표현
		int i;
		int result=0;
		
		while(true) {
			i = sc.nextInt();
			result = result + i;
			System.out.println("합계: " + result);
			
			if(i==0) {
				System.out.println("종료");
				break;
			}
		}
		
		sc.close();
	}
}
