package com.learn.enums;

import java.util.EnumSet;

public class AnimalEnumTest {

	public static void main(String[] args) {
		//normal enum iteration
		/*for(AnimalEnum en : AnimalEnum.values()) {
			// first -30s% space between first two,then next -30s% is space between noOflegs and nature, third one %s is only to print the third value, n in the end to move the cursor to next line
			System.out.printf("%-30s%-30s%s%n", en.getName(), en.getNoOFLegs(), en.getNature());
		}*/
		
		// lets try the util, use this to define a range of constants you want to use
		System.out.printf("%-25s%-35s%s%n", "name", "number of legs", "Nature");
		System.out.println("-----------------------------------------------------------------------------------");
		for(AnimalEnum en : EnumSet.range(AnimalEnum.DOG, AnimalEnum.CAT)) {
			System.out.printf("%-30s%-30s%s%n", en.getName(), en.getNoOFLegs(), en.getNature());
		}
	}
}
