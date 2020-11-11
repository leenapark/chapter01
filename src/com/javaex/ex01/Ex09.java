package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1 < n2);  // 5<3 -->false
		System.out.println(n1 > n2);  // 5>3 -->true
		
		System.out.println(n1 <= n2); // 5 <= 3 -->false
		System.out.println(3 <= n2); // 3 <= 3 -->true
		
		System.out.println(n1 >= n2); // 5 >= 3 -->true
		System.out.println(3 >= n2); // 3 >= 3 -->true
		
		System.out.println(n1 == n2); // 5 == 3 -->false
		System.out.println(n1 != n2); // 5 != 3 -->true
	
		
		boolean result = n1 != n2;
	}

}
