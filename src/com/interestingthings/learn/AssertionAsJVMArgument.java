package com.interestingthings.learn;

import java.util.Scanner;

public class AssertionAsJVMArgument {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//allow if number is less than 10, to enable assertion, make new java configuration, pass -ea as VM argument
		assert (num < 10) ? true : false;
		System.out.println("Num is valid" + num);
	
}
}
