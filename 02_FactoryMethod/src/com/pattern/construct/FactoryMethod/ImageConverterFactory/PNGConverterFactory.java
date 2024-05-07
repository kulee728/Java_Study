package com.pattern.construct.FactoryMethod.ImageConverterFactory;

import com.pattern.construct.FactoryMethod.imageConverter.ImageConverter;
import com.pattern.construct.FactoryMethod.imageConverter.PNGImageConverter;

public class PNGConverterFactory extends ImageConverterFactory{

	@Override
	public ImageConverter createImageConverter() {
		return new PNGImageConverter();
	}

}
