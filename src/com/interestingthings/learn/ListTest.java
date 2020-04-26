package com.interestingthings.learn;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		Student sam = new Student("sam", "24");
		Student saif = new Student("sam", "27");

		if (null !=studentList) {
			for (Student student : studentList) {
			System.out.println(student);	
			}
		}
	}
}