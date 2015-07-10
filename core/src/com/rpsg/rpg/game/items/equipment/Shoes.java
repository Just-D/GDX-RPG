package com.rpsg.rpg.game.items.equipment;

import com.rpsg.rpg.object.base.items.Equipment;

public class Shoes extends Equipment{

	private static final long serialVersionUID = 1L;

	public Shoes() {
		name="草鞋";
		statusName="草鞋[防御+5 魔防+1]";
		prop.put("defense", 5);
		prop.put("magicDefense", 1);
		illustration="很普通的草鞋，仅仅是贫穷的象征，穿上去感觉怪怪的。";
		equipType=Equipment.EQUIP_SHOES;
		onlyFor=null;
		icon=2;
	}

	@Override
	public boolean use() {
		return false;
	}

}