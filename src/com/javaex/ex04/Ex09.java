package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*내가 짠 코드
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			if(num%3==0&&num!=0) {
				System.out.println("3의 배수입니다");
			}else if(num==0) {
				
				break;
			}else{
			System.out.println("3의 배수가 아닙니다");
			}
		}
		*/
		
		boolean action = true;
		
		while(action) {
			System.out.println("숫자를 입력하세요");
			int no = sc.nextInt();
			if(no==0) {
				System.out.println("종료");
				//true-->false를 바꿔서 종료할 수도 있음
				action = false;
				//break;
			}else if(no%3==0) {
				System.out.println("3의 배수입니다");
			}else {
				System.out.println("3의 배수가 아닙니다");
			}
		}
		sc.close();
	}

}
