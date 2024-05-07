package com.pattern.construct.FactoryMethod.game.probability;
import java.util.Random;

public class MovingGenerator extends RandomMessageGenerator implements RandomValueCalculator{
	private int movementSpeed;
	private int resultMove;
	private double coefficient;

	public MovingGenerator(int movementSpeed){
		super();
		double probability = this.random.nextDouble();
		this.movementSpeed = movementSpeed;
		probabilityToValues(probability);
	}
	
	@Override
	public void probabilityToValues(double probability) {
		if(probability>0.95) {
			this.coefficient = 2.0 + this.random.nextDouble()*1.5;
			this.message = "미쳐버린 움직임!";
		}
		else if(probability>0.75) {
			this.coefficient = 1.3 + this.random.nextDouble()*0.2;
			this.message = "신속한 움직임! ";
		}
		else if(probability>0.25) {
			this.coefficient = 0.9 + this.random.nextDouble()*0.2;
			this.message = "";
		}
		else if(probability>0.05) {
			this.coefficient = 0.3 + this.random.nextDouble()*0.3;
			this.message = "당황하였습니다! 느려져 ";
		}
		this.resultMove = (int) (this.movementSpeed * this.coefficient); 
		this.message += "최대" + this.resultMove + "칸을 움직일 수 있습니다!";
		
		if(probability<=0.05) {
			this.coefficient = 0;
			this.message = "앗! 넘어졌습니다! 당분간 움직일 수 없습니다!";
		}
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	public int getResultMove() {
		return this.resultMove;
	}

}
