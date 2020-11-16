package com.javaex.ex04;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println("===========문제 1번============");
		
		int i, sum;
		
		sum = 0;
		
		for(i = 1; i<=10; i++) {//괄호 안에 있는 식은 괄호 대괄호가 끝나는 동시에 사라진다
			sum = sum+i;
		}
		System.out.println("1부터 10까지 정수의 합은 " + sum + " 입니다");
		
		System.out.println("===========문제 2번============");
		
		int j, result;
		
		result = 0;
		
		for(j = 1; j <= 10; j++) {
			result = result + j;
			System.out.println("1부터 10까지 정수의 합은 " + result + " 입니다" );
		}
	
	}
}
