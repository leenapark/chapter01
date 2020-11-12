package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int pay;
		int unit = 10000; //기본 시급
		int time; //근무 시간
		
		time = sc.nextInt();
		
		
		if(time>8) {
			pay = (time-8)*((int)(unit*1.5))+8*unit;
			
		}else {
			pay = time*unit;
		}
		
		System.out.println("임금은 "+pay+" 입니다");
		
		sc.close();
	}
}
