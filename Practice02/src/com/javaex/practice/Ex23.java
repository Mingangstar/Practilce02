package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
		System.out.printf("년도: ");
		int year = sc.nextInt();
		
		int year2 = 2023;
		int age = year2-year;
		
		System.out.println("올해:" + year2);
		System.out.println("태어난해:" + year);
		System.out.println("나이:" + age);
		System.out.println("====================");
		
		if(age < 20) {
			System.out.println("20살미만 건강검진대상이 아님");
		} else if(age >= 20) {
			System.out.println("20살 이상");
			if(year2 % 2 == 0) {
				System.out.println("건강검진해");
				
				if(age >= 40) {
					System.out.println("암 검사");
				} else if(age <= 40) {
					System.out.println("암 검사X");
				}
			} else if(year2 % 2 == 1) {
				System.out.println("건강검진해 아님");
				
			}

			 
		} 
		

		 
		
	}

}
