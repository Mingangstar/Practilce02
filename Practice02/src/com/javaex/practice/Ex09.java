package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/* 아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		 * 태어난 년도를 입력 받습니다.
		 * 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		 * 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
니다.
		 * 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.println("태어난 년도 입력해 주세요");
		System.out.printf("년도: ");
		int year = sc.nextInt();

		int year2 = 2023 - year;
		
		if (year2 >15 && year2 <= 65) {
			System.out.println(year2+"살 무료예방접종 대상자 입니다");
		} else {
			System.out.println(year2+"살 무료예방접종 대상자가 아닙니다");
		}
		
	}

}
