package com.pattern.construct.FactoryMethod.game.unit;

import com.pattern.construct.FactoryMethod.game.probability.AttackGenerator;
import com.pattern.construct.FactoryMethod.game.probability.MovingGenerator;

public class UnitArcher extends Unit{
	
	public UnitArcher(String name, int attackDamage, int attackRange,int movementSpeed,int hp) {
		super(name,attackDamage,attackRange,movementSpeed, hp);
	}
	
	@Override
	public int attack() {
		AttackGenerator atkG = new AttackGenerator(attackDamage);
		int resultDamage = atkG.getResultDamage();
		String attackMessage = atkG.getMessage();
		System.out.println("궁수 "+name+" 활을 쏘아 공격합니다!");
		System.out.println("최대 사정거리 : "+attackRange);
		System.out.println(attackMessage+" "+resultDamage +"의 피해를 입혔습니다! (공격력 : "+attackDamage+")");
		return resultDamage;
	}

	@Override
	public void move() {
		MovingGenerator mvg = new MovingGenerator(movementSpeed);
		String moveMessage = mvg.getMessage();
		System.out.println("궁수 "+name +","+" 이동을 시도합니다.");
		System.out.println(moveMessage);
	}

	@Override
	public void specialAbility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return "Archer";
	}

	@Override
	public String toString() {
		String str = "";
		str =  "이름 : " + getName()+"\n" 
				+ "직업 : Archer\n"
				+"공격력 : "+attackDamage+ "\n"
				+"사정거리 : "+attackRange+ "\n"
				+"이동속도 : "+movementSpeed+ "\n";
		return str;
	}

	@Override
	public int hpController() {
		
		return this.hp;
	}

	@Override
	public int hpController(int Damage) {
		this.hp -=Damage;
		return this.hp;
	}




}
