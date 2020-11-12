package com.javaex.ex03;

import java.util.Scanner;

public class EX08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		/*내가 짠 코드
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
			System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		*/
		
		int point = sc.nextInt();
		
		if(point>0) {
			if(point%2==0) {//조건식은 트루 값을 넣는다
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else if(point<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
