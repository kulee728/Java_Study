package com.regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularEx1 {
	/* 정규식 (Regular Expression)
	 문자열 내 패턴 검색, 패턴의 활용
	 
	 1. 문자
	 [abc] : a,b,c 중 하나와 일치한다면
	 [^abc] : a,b,c 이외의 문자와 일치한다면
	 [a-z] : a~z 소문자 일치확인
	 [A-Z] : 대문자 A~Z 일치확인
	 [0-9] : 0~9 일치하는지
	 [가-힣] : 한글인지
	 [ㄱ-ㅎ] : 자음 일치하는지
	 [ㅏ-ㅣ] : 모음 일치하는지
	 
	 2.지정자 : 규칙
	 * : 0개 이상 문자와 일치
	 + : 1개 이상 문자와 일치
	 ? : 0 또는 1개의 문자와 일치
	 {n} : n개 문자와 일치
	 {n,} : n개 이상 문자와 일치
	 {n,m} : n이상 m이하 문자와 일치
	 
	 \\b[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]
	 String regExpCellPhone = "(02|010)-\\d{3,4}-\\d{4}";
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("한글을 입력하세요 : ");
		String input = sc.next();
		if(Pattern.matches("^[가-힣ㄱ-ㅎ]*$", input)) {
			System.out.println("한글을 입력하셨습니다.");
		}
		else {
			System.out.println("한글만 입력해주세요~");
		}
	}

}
