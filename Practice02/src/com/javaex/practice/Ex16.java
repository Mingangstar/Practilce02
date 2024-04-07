package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.printf("숫자: ");
		float x = sc.nextFloat();
		
		if(x <= 0) {
			System.out.println("계산결과는" + (x*x*x-9*x+2) + "입니다.");
		} else {
			System.out.println("계산결과는" + (7*x+2) + "입니다.");
		}
	}

}
