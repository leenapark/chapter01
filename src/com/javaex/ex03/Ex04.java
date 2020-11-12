package com.javaex.ex03;

import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		/*
		int excess; //급여
		int time; //근무시간
		
		time = sc.nextInt();
		
		
		
		if(time<=8){
			int basic = time*10000;
			System.out.println("임금은 "+basic+" 입니다");
		} else if(time>8) {
			excess = (time-8)*12000+8*10000;
			System.out.println("임금은 "+excess+" 입니다");
		}
		*/
		
		int pay; //급여
		int time; //근무 시간
		
		time = sc.nextInt();
		
		pay=0;
		
		
		if(time>8) {
			pay = 8*10000+(time-8)*12000;
			
		}else {
			pay = time*10000;
		}
		
		System.out.println("임금은 "+pay+" 입니다");
		
		sc.close();
		
		
	}
}
