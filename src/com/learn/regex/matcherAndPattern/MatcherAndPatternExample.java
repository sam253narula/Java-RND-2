package com.learn.regex.matcherAndPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherAndPatternExample {

	public static void main(String[] args) {
		
		Pattern expression =  Pattern.compile("\\d[0-58-9]-\\d\\d-\\d\\d\\d\\d");
		String birthdays = "11-08-1995";;
		Matcher matcher = expression.matcher(birthdays);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
