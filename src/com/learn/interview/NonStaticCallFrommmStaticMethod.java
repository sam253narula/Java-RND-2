package com.learn.interview;

public class NonStaticCallFrommmStaticMethod {

	public static void main(String[] args) {
		NonStaticCallFrommmStaticMethod m = new NonStaticCallFrommmStaticMethod();
		System.out.println(m.hello());
	}
	private String hello() {
		return "Hello";
	}

}
