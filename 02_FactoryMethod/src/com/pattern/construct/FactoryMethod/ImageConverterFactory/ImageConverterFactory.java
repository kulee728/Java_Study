package com.pattern.construct.FactoryMethod.ImageConverterFactory;

import com.pattern.construct.FactoryMethod.imageConverter.ImageConverter;

public abstract class ImageConverterFactory {
	public abstract ImageConverter createImageConverter();
	//크리에이터는 구상 크리에이터들에게 제품을 생성하는 추상메서드를 제공한다.
	//"반환형을 통해 제품 객체를 반환하는 팩토리 메서드를 선언한다"
	//추상메서드를 통해 subclass에서 자체버전 제품 반환을 강제하거나, 기본형을 리턴하도록 만든다.
	
}
