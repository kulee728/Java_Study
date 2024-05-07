package com.pattern.construct.FactoryMethod.game.probability;

import java.util.Random;

public class RandomMessageGenerator {
	protected String message;
	protected Random random;
	
	protected RandomMessageGenerator(){
		random = new Random();
	}
}
