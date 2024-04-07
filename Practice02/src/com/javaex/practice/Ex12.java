package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.printf("숫자1: ");
		int number = sc.nextInt();
		
		System.out.printf("숫자2: ");
		int number2 = sc.nextInt();
		
		System.out.printf("숫자3: ");
		int number3 = sc.nextInt();
		
		int min;
		
		if(number < number2 && number < number3) {
			min = number;
		} else if(number2 < number && number2 < number3) {
			min = number2;
		} else {
			min = number3;
		}
		
		System.out.println("가장 작은수는" + min + "입니다." );

	}

}
