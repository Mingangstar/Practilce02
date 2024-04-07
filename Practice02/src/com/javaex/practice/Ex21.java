package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("사번(정수를) 입력해주세요");
		System.out.println("사번: ");
		int number = sc.nextInt();
		
		if (number == 0) { // 제약 게념 먼저 쓰기
			System.out.println("잘못된 사번입니다.");
		} else if(number % 3 == 0) {
			System.out.printf("A팀입니다.");
		} else if(number % 3 == 1) {
			System.out.println("B팀입니다.");
		} else if(number % 3 == 2) {
			System.out.println("C팀입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	}

}
