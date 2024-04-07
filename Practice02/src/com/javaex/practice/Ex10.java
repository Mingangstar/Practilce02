package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");	
		System.out.printf("숫자1: ");
		int number = sc.nextInt();
		
		System.out.printf("숫자2: ");
		int number2 = sc.nextInt();
		
		if (number > number2) {
			System.out.println("큰수: " + number + "" + "작은수: " + number2 + "입니다.");
		} else if ( number2 > number) {
			System.out.println("큰수: " + number2 + "" + "작은수: " + number + "입니다." );
		} else {
			System.out.println("큰수: " + number2 + "" + "작은수: " + number + "입니다. ");
		}
	}

}
