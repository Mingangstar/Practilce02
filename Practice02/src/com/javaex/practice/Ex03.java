package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
			
		/* 문제
		 * age가 0살 초과이고 18살 미만 이면
		 * if(0<age<18 {System.out.println("청소년 입니다.") 

		 */
		
		
		int age = 15;
		if(age < 0 || age > 18) {
			System.out.println("청소년 입니다.");
		}
	}

}
