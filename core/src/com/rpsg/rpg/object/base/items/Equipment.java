package com.rpsg.rpg.object.base.items;

import com.rpsg.rpg.object.rpg.Hero;

public class Equipment extends BaseItem implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	{
		prop.put("maxhp", 0);
		prop.put("maxmp", 0);
		prop.put("attack", 0);
		prop.put("magicAttack", 0);
		prop.put("defense", 0);
		prop.put("magicDefense", 0);
		prop.put("speed", 0);
		prop.put("hit", 0);
	}
	
	public Class<? extends Hero> onlyFor;
	
	public String illustration2;
	
	public String equipType;
	
	public static String EQUIP_SHOES="EQUIP_SHOES";
	public static String EQUIP_CLOTHES="EQUIP_CLOTHES";
	public static String EQUIP_WEAPON="EQUIP_WEAPON";
	public static String EQUIP_ORNAMENT1="EQUIP_ORNAMENT1";
	public static String EQUIP_ORNAMENT2="EQUIP_ORNAMENT2";
	
	public void put(String _prop,int num){
		prop.put(_prop, num);
	}
	
}
