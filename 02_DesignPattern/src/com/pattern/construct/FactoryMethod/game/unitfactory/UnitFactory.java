package com.pattern.construct.FactoryMethod.game.unitfactory;

import com.pattern.construct.FactoryMethod.game.unit.Unit;

public abstract class UnitFactory {
	public abstract Unit createUnit(String name, int attackDamage, int attackRange);
	public abstract String getClassName();
}
