package com.pattern.construct.FactoryMethod.game.unitfactory;

import com.pattern.construct.FactoryMethod.game.unit.Unit;
import com.pattern.construct.FactoryMethod.game.unit.UnitArcher;

public class ArcherFactory extends UnitFactory {
	
	
	@Override
	public Unit createUnit(String name, int attackDamage, int attackRange) {
		return new UnitArcher(name,attackDamage,attackRange,10,1000);

	}

	@Override
	public String getClassName() {
		return "Archer";
	}

}
