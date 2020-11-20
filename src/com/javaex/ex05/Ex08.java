package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
			//배열 2개를 선언하고 동일한지 비교하세요
			
			int[] leftArray = new int[]{13, 21, 33};
			int[] rightArray = new int[]{10, 20, 30,};
			
			//코드작성

			/*
			//같은 경우 내가 작성한 것
			for(int i=0; i<leftArray.length; i++) {
				System.out.println(leftArray[i]);
			}
			
			for(int i=0; i<rightArray.length; i++) {
				System.out.println(rightArray[i]);
			}
			*/
			
			//다른 경우
			/*혼자 풀기 실패
			int[] leftArray = new int[]{10, 20, 30};
			int[] rightArray = new int[]{12, 23, 30, 50};
			
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i]!=rightArray[i]) {
					System.out.println("두 배열의 크기가 다릅니다");
					break;
				}
			}
			for(int i=0; i<rightArray.length; i++) {
				if(rightArray[i]>leftArray[i]) {
					System.out.println("0번째 값이 다릅니다.");
				}
			}
			*/
			
			//강사님과 함께 하는 문제풀이
			//if문으로 먼저 두 배열의 수를 비교해준다
			
			if(leftArray.length==rightArray.length) {
				//세부 비교
				for(int i=0; i<leftArray.length; i++) {
					if(leftArray[i]!=rightArray[i]) {
						System.out.println(i+"번째 값이 다릅니다.");
					}
				}
				
			}else {
				System.out.println("배열의 크기가 다릅니다");
			}
			
	}
}
