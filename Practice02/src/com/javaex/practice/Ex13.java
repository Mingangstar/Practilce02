package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자: ");
		int number = sc.nextInt();
		
		System.out.printf("두번째 숫자: ");
		int number2 = sc.nextInt();

		int small;
		int large;
		
		if (number < number2) { 
			small = number;
			large = number2;
		} else {
			small = number2;
			large = number;
		}
		
		
		if (large % small ==0) {
			System.out.println(small + "는(은)" + large + "약수입니다.");
		} else {
			System.out.println(small + "는(은)" + large + "약수가 아닙니다."); 
		}
	}

}
