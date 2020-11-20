package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {
		int num = 3;
		int num2 = num;
		num2 = 7;
		
		
		System.out.println(num); // 3
		System.out.println(num2); // 7
		
		num = 100;
		
		System.out.println(num); // 100
		System.out.println(num2); // 7
		//num2는 num의 값을 받은 수 num2 = 7 이란 값을 받아서 7 이 된다
	}
}
