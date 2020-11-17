package com.javaex.ex04;

public class Ex06 {
	public static void main(String[] args) {
		
		/* 내가 짠 코드
		String i;
		int s = 1;
		
		for(i = "******"; s<=6; s++) {
			System.out.println(i);
		}
		*/
		
		//문자를 프린트로 출력하고 횟수를 조건식으로 잡아줌
		int y, x;
		for(y=0; y<6; y++) {
			for(x=0; x<10; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
}
