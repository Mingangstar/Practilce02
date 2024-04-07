package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요:");
		int age = sc.nextInt();
		
		System.out.println("나이:"+age);
		
		if(age >= 19 && age < 65) {
			System.out.println("1번그룹 입니다.");
		} else {
	  		System.out.println("2번그룹 입니다.");
		}
	}		 		
}
