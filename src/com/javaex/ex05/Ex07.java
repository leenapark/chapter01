package com.javaex.ex05;

public class Ex07 {
	public static void main(String[] args) {
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB;
		arrB = arrA; //주소값만 복사됨
					 //같은 데이터를 바라본다(가지고 있음)
					 //실제 데이터가 복사되는 것은 아니다 데이터 하나를 공유함
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
		System.out.println("============================");
		//arrA[1] = 100; 으로 변경했을 때 arrB의 값은?
		
		arrA[1] = 100;
				
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
}
