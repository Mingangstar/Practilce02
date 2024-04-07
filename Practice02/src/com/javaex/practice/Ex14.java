 package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	/*	사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
		⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
		⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
		(사번 0은 고려하지 않습니다.)*/
		
		Scanner sc= new Scanner (System.in);
		
		System.out.printf("사번(정수)를 입력해주세요");
		System.out.printf("사번: ");
		int employeenumber = sc.nextInt();
		
		if(employeenumber % 3 == 0) {
		System.out.println("A팀입니다.");
	 } else if(employeenumber % 3 == 1) {
		 System.out.println("B팀입니다.");
	 } else if(employeenumber % 3 == 2) {
		 System.out.println("C팀입니다.");
	 }
  }		
}
