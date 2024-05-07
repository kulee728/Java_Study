package com.pattern.construct.FactoryMethod.ImageConverterFactory;
import com.pattern.construct.FactoryMethod.imageConverter.ImageConverter;
import com.pattern.construct.FactoryMethod.imageConverter.JPGImageConverter;

public class JPGConverterFactory extends ImageConverterFactory {

	@Override
	public ImageConverter createImageConverter() {
		return new JPGImageConverter();
	}

}
