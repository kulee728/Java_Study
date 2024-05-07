package com.pattern.construct.FactoryMethod.game.unit;

public abstract class Unit implements UnitAbilities {
	protected String name;
	protected int attackDamage;
	protected int attackRange;
	protected int movementSpeed;
	protected int hp;
	
	public Unit(String name, int attackDamage, int attackRange, int movementSpeed,int hp) {
		this.name = name;
		this.attackDamage = attackDamage;
		this.attackRange = attackRange;
		this.movementSpeed = movementSpeed;
		this.hp = hp;
	}
	public abstract int hpController();
	public abstract int hpController(int Damage);
	public abstract int attack();
	public abstract void move();
	public abstract void specialAbility();
	public abstract String getClassName();	
	public abstract String toString();
	
	public String getName() {
		return this.name;
		
	}
}
