package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("=======");
		System.out.println(7.0 / 2.0); //정수형 나누기랑 비교
		System.out.println(7.0 % 2.0);
		System.out.println("=======");
		
		//부호연산자
		int var01 = -3;
		System.out.println(var01);
		System.out.println(-var01);
		System.out.println(+var01);
		System.out.println("=======");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); // 실제 변수 a값이 변경된다. 7-->8 출력
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); // 실제 변수 b값이 변경된다. 2-->1 출력
		System.out.println(b);
		
		System.out.println("=======");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		b++;  //++b 같다
		System.out.println(b);
		
	}

}
