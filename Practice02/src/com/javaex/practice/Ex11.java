package com.javaex.practice;

import java.util.Scanner;

public class Ex11  {  

	public static void main(String[] args) {
		// 두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자: ");
		int number = sc.nextInt();
		
		System.out.printf("두번째 숫자: ");
		int number2 = sc.nextInt();
		
		if(number > number2 ) {
			System.out.println("몫: " + (number/number2) + "\n"
					+ "나머지: " + (number%number2));
		} else if(number2 > number) {
			System.out.println("몫: " + (number2/number) + "\n"
					+ "나머지: " + (number2%number));
		} else {
			System.out.println("몫: " + (number/number2) + "\n"
					+ "나머지: " + (number%number2));
		}

	}

}
