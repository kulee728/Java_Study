package com.pattern.construct.FactoryMethod.ImageConverterRun;

import com.pattern.construct.FactoryMethod.ImageConverterFactory.ImageConverterFactory;
import com.pattern.construct.FactoryMethod.ImageConverterFactory.JPGConverterFactory;
import com.pattern.construct.FactoryMethod.ImageConverterFactory.PNGConverterFactory;
import com.pattern.construct.FactoryMethod.imageConverter.ImageConverter;

public class Run {

	public static void main(String[] args) {
		ImageConverterFactory jcf = new JPGConverterFactory();
		ImageConverter jc = jcf.createImageConverter();
		jc.convert("Input.jpg", "Output");
		ImageConverterFactory pcf = new PNGConverterFactory();
		ImageConverter pc = pcf.createImageConverter();
		pc.convert("Input.png", "Output");
	
		//ImageConverter : 제품 (제품명 : 이미지 변환기) > 구상 제품들에게 interface를 제공한다.
		//JPGImageConverter : 구상 제품. 팩토리를 통해 생성 될 수 있다. 
		//ImageConverterFactory : 팩토리/크리에이터(제품을 생성하는 팩토리 메서드를 선언) > 구상 팩토리들에게 추상(팩토리)메서드를 제공
		//JPGConverterFactory : 구상 크리에이터  > 각자 구상 제품에 대한 생성이나 특정 기능을 수행한다.
		//Run : 팩토리를 new로 가동시키는 client
		
		/* 정리
		 * 팩토리 메서드는 제품과 크리에이터, 클라이언트로 나뉜다.
		 * 제품은 실제 제품을 가리키는 구상 제품들에게 공통적으로 가져야하는 정보 묶음 interface를 제공한다.
		 * 크리에이터는 제품을 생성하는 팩토리(공장)메서드를 선언하며, 구상 제품들을 각자 생성하는
		 * 구상 크리에이터에게 공통적으로 가져야하는 정보 묶음 추상 클래스/interface를 제공한다.
		 * 
		 * 클라이언트는 팩토리 메서드를 활용하기위해 기본형 자료형인 크리에이터와 제품을 활용하고,
		 * 그 값을 할당할 때(구체화) 구상 클래스들을 활용한다.
		 */
	}

}
