package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.printf("기호:");
		String a = sc.next();
		
		System.out.printf("숫자1:");
		float number = sc.nextFloat();
		
		System.out.printf("숫자2:");
		float number2 = sc.nextFloat();
		
		if(a.equals("+")) {
			System.out.printf("결과는:" + (number + number2));
		} else if (a.equals("-")) {
			System.out.printf("결과는:" + (number - number2));
		} else if (a.equals("*")) {
			System.out.println("결과는:" + (number * number2));
		} else if(a.equals("/")) {		
			if (number2 == 0) {
				System.out.printf("계산할 수 없습니다");
			}
			else  {
				System.out.println("결과는:" + (number / number2));
				}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		

	}

}
