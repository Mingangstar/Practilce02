package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
		
		int age;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		
		/*
		 * 15일떼 결과 : 2번 그룹
		 * 19일때 결과 : 2번 그룹
		 * 20일때 결과 : 2번 그룹
		 * 21일때 결과 : 1번 그룹
		 * 100일뗴 걀과 : 1번 그룹
		 */
	}

}
