package com.pattern.construct.FactoryMethod.game.probability;

import java.util.Random;

public class AttackGenerator extends RandomMessageGenerator implements RandomValueCalculator{
	private int resultDamage;
	private double coefficient;
	
	public AttackGenerator(int attackDamage) {
		super();
		double probability = this.random.nextDouble();
		probabilityToValues(probability);
		this.resultDamage = (int) (attackDamage*coefficient);
	}
	

	@Override
	public void probabilityToValues(double probability) {
		if(probability>0.95) {
			this.message = "급소에 맞았다!";
			this.coefficient = 2.0 + random.nextDouble()*1.5;
		}
		else if(probability>0.75) {
			this.message = "크리티컬!";
			this.coefficient = 1.3 + random.nextDouble()*0.2;
		}
		else if(probability>0.25) {
			this.message = "";
			this.coefficient = 0.9 + random.nextDouble()*0.2;
		}
		else if(probability>0.05) {
			this.message = "빗맞았다!";
			this.coefficient = 0.3 + random.nextDouble()*0.3;
		}
		else {
			this.message = "완전히 빗나갔다!";
			this.coefficient = 0;
		}
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	public int getResultDamage() {
		return resultDamage;
	}
	
	
}
