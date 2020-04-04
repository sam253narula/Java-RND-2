package com.learn.interview;

public class StaticInstanceSuperConstrFLow {

	public static void main(String[] args) {
		Dog a = new Dog();
		System.out.println("Main Method");
	}
}

class Animal{
	{
		System.out.println("Animal Instance Block");
	}
	public Animal(){
		System.out.println("Animal const");
	}
	
	static {
		System.out.println("Animal static block");
	}
}
class Dog extends Animal{
	public Dog() {
		System.out.println("Dog const");
	}
	{
		System.out.println("Dog Instance Block");
	}
	static{
		System.out.println("Dog static block ");
	}
}
