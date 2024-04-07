package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
		프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.printf("키: ");
		double cm = sc.nextDouble();
		
		System.out.printf("몸무게: ");
		double kg = sc.nextDouble();
		
		double bmi = kg / ((cm/100)*(cm/100));
		
		if(bmi >= 18.5 && bmi <= 24.9) { //bmi가 18.5 이상
			System.out.println("정상체중입니다.");
		} else if (bmi < 18.5) {
			System.out.println("저체중입니다.");
		} else if (bmi > 24.9) {
			System.out.println("과체중입니다.");
		}
		
		System.out.println("BMI: "+ bmi);
		
	}

}
