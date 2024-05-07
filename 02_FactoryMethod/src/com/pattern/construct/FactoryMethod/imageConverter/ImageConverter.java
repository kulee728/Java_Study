package com.pattern.construct.FactoryMethod.imageConverter;

public interface ImageConverter {
	public void convert(String inputFile, String outputFile);
}
//product ImageConverter : (Product) ImageConverter 인터페이스를 제공한다