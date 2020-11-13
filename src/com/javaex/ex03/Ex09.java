package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하시오");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목번호: ");
		
		int lecture = sc.nextInt();
		/*내가 짠 if문
		if(lecture==1) {
			System.out.println("R101호");
		}else if(lecture==2) {
			System.out.println("R202호");
		}else if(lecture==3) {
			System.out.println("R303호");
		}else if(lecture==4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		*/
		
		// 스위치 케이스문
		
		switch(lecture){
			case 1:
				System.out.println("R101호");
				break;
			case 2:
				System.out.println("R202호");
				break;
			case 3:
				System.out.println("R303호");
				break;
			case 4:
				System.out.println("R404호");
				break;
			default:
				System.out.println("상담원과 문의하세요");
				break;
		}
		
		sc.close();
	}
}
