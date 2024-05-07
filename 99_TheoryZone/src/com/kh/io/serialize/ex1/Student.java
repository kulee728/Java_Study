package com.kh.io.serialize.ex1;

import java.io.Serializable;


//Serializable interface 표기해주지 않으면 에러 난다.
public class Student implements Serializable { 
	//직렬화 : 객체를 바이트 스트림으로 변환하는 과정
	//역직렬화 :Deserialization (
	
	//데이터 백업 <> 복원
	//네트워크 통신& 전송
	//캐시 저장
	
	private String name;
	private int age;
	transient public String KSSN;
	
	public Student() {
		
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
