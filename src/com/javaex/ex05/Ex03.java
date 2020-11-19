package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		//A[a] = B 일 때 B가 전부 같으면 for문을 이용할 수 있음
		lotto[0] = (int) (Math.random()*45)+1;
		lotto[1] = (int) (Math.random()*45)+1;
		lotto[2] = (int) (Math.random()*45)+1;
		lotto[3] = (int) (Math.random()*45)+1;
		lotto[4] = (int) (Math.random()*45)+1;
		lotto[5] = (int) (Math.random()*45)+1;
		
	
		for(int i=0; i<lotto.length; i++) {//.length = 배열의 마지막까지라는 뜻
			System.out.print(lotto[i]+"\t");
		}
	}
}
