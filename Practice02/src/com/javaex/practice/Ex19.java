package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
		System.out.println("년도: ");
		int year = sc.nextInt();
	
		int year2 = 2023-year;
	
		if(year2 < 15 || year2 >= 65) {
			System.out.println(year2 + "살 무료접종대상자 입니다");
		} else {
			System.out.println(year2 + "살 무료예방접종 대상자가 아닙니다");
		}
		
	}

}
