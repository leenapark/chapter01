package com.javaex.ex04;

public class Ex07 {
	public static void main(String[] args) {
		/*내가 짠 코드
		String q;
		int s = 1;
		
		for(q = "*"; s<=6; s++) {
			System.out.println(q);
			q += "*";
		}
		*/
		
		//문자를 프린트로 출력 yline 줄 순서에 맞춰 갯수가 늘어나는 조건식을 만들어줘야함
		int yline, xline;
		
		for(yline=1; yline<=6; yline++) {
			for(xline=1; xline<=yline; xline++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
