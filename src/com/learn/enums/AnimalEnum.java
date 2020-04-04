package com.learn.enums;
//declare an enum types with constructor and explicit instance fields and accessors for these fields
public enum AnimalEnum {
// declare constancts of enum type
	DOG("Brownie","4","domestic"),
	CAT("Tom", "4", "domestic"),
	RAT("Jerry", "2","just be funnt domestic");
	
	//instance fields
	private final String name;
	private final String noOFLegs;
	private final String nature;

	//enum const
	private AnimalEnum(String name, String noOFLegs, String nature) {
		this.name = name;
		this.noOFLegs = noOFLegs;
		this.nature = nature;
	}

	public String getName() {
		return name;
	}

	public String getNoOFLegs() {
		return noOFLegs;
	}

	public String getNature() {
		return nature;
	}
	
}
