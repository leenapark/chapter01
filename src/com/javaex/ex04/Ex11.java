package com.javaex.ex04;

public class Ex11 {
	public static void main(String[] args) {
		
		for(int num=1; num<=20; num++) {
			if(num%2==0||num%3==0) {
				continue;//continue는 순서 2번으로 간다
			}
			System.out.println(num);
		}
		System.out.println("==========같은 출력/다른 식=============");
		//다른 식 같은 값 출력
		for(int i=1;i<=20;i++) {
			if(i%2==0||i%3==0) {
				//공백으로 놓아준다
			}else {
				System.out.println(i);
			}
		}
		
		System.out.println("==========같은 출력/다른 식=============");
		//다른 식 같은 값 출력
		for(int j=1;j<=20;j++) {
			if(!(j%2==0||j%3==0)) {
				System.out.println(j);
			}
		}
	}
}
