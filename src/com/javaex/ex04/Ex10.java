package com.javaex.ex04;

public class Ex10 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==0&&i%3==0) {
				break;
				//System.out.println("break"); 논리적 오류 break가 끝나버리기 때문에 실행될 수 없는 자리임
			}
			System.out.println(i);
		}//for문만 종료 된다
		//여기부터는 break 영역이 아님
		System.out.println("=======continue==========");
		
		for(int j=1; j<=10; j++) {
			if(j%2==0&&j%3==0) {
				continue;
			}
			System.out.println(j);
		}
	}
}
