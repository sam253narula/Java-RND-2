package com.mirosoft.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowePuffGirlsQin {
	public static void main(String[] args) {
		/// solution 2
		// Write code here

		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		List<Long> ingredients = new ArrayList<Long>();
		List<Long> quantities = new ArrayList<Long>();
		int lastOutcome =0;
		try {
			for (int i = 0; i < n; i++) {
				Long temp = sc.nextLong();
				if (temp >= 0) {
					ingredients.add(temp);
				} else {
					throw new RuntimeException();
				}
			}
			
			for (int i = 0; i < n; i++) {
				Long temp = sc.nextLong();
				if (temp > 0) {
					quantities.add(temp);
				} else {
					throw new RuntimeException();
				}

			}
			Long powerPuffGirls = Long.MAX_VALUE;
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				Long num = quantities.get(i);
				Long den = ingredients.get(i);
				if(den == 0)
					continue;
				try {
					Long result = num / den;
					if (result < powerPuffGirls) {
						powerPuffGirls = result;
					}
				} catch (Exception e) {
					System.out.println("0");
					flag = false;
				}

			}
			if (flag) {
				System.out.println(powerPuffGirls);
			}
		} 
		catch (Exception e) {
			System.out.println(lastOutcome);
		}
	}
}
