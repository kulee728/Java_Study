package com.pattern.construct.FactoryMethod.imageConverter;

public class PNGImageConverter implements ImageConverter{

	@Override
	public void convert(String inputFile, String outputFile) {
        System.out.println("Converting " + inputFile + " to PNG format...");
        System.out.println("Saved as " + outputFile + ".png");
	}
	//Concrete product A : 구상 제품 A는 제품의 인터페이스에 따라
	//기능을 재정의하여 수행한다.
}
