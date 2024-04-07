package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.println("금익: ");
		float number = sc.nextFloat();
		
		if(number >= 0 && number <= 1000) {
			System.out.printf("소득세는" + (0.09*number));
		} else if (number > 1000 && number <= 4000) {
			System.out.printf("소득세는" + (1000*0.09+0.18*(number-1000)));
		} else if (number > 4000 && number < 8000) {
			System.out.println("소득세는" + (1000*0.09 + 0.18*(number-4000)));			
		} else if (number >= 8000) {
			System.out.println("소득세는" + (1000*0.09 + 3000 * 0.18 + 4000*0.27 + 0.36*(number-8000)));
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
		
	}

}
