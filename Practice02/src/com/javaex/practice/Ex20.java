  package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.println("알파벳: ");
		String a = sc.next();
		
		switch(a) {
			case "i" :
			case "a" :
			case "e" :
			case "o" :
			case "u" :
				System.out.println("모음입니다.");
			break;
			default :
				System.out.println("자음입니다.");
		}
		
		

	}

}
