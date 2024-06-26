package com.pattern.construct.FactoryMethod.game.unitfactory;

import com.pattern.construct.FactoryMethod.game.unit.Unit;
import com.pattern.construct.FactoryMethod.game.unit.UnitCavalry;

public class CavalryFactory extends UnitFactory {

	@Override
	public
	Unit createUnit(String name, int attackDamage, int attackRange) {
		return new UnitCavalry(name,attackDamage,attackRange,20,1500);
	}

	@Override
	public String getClassName() {
		return "Cavalry";
	}

}
