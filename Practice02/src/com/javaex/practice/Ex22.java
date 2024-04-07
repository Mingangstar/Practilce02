package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.printf("숫자1: ");
		int number = sc.nextInt();
		
		System.out.printf("숫자2: ");
		int number2 = sc.nextInt();
		
		System.out.printf("숫자3: ");
		int number3 = sc.nextInt();
		
		int max;
		
		if(number >= number2 && number >= number3) {
			max = number;
		} else if (number2 >= number && number2 >= number3) {
			max = number2;
		} else {
			max = number3;
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
		
		sc.close();
	}

}
