package com.mirosoft.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BayBladePart2 {

	public static void main(String[] args) {
		long lStartTime = new Date().getTime();
		int noOfTestCases = 1;
		for (int i = 0; i < noOfTestCases; i++) {
			// Number of opponents
			int noOfOpponents = 10;
			// GReolution Powers
			List<Integer> gRevolutionPowers = Arrays.asList(3, 6, 7, 5, 3, 5, 6, 2, 9, 1);
			// Opponent Powers
			//List<Integer> opponentPowers = Arrays.asList(2, 7, 0, 9, 3, 6, 0, 6, 2, 6);
			List<Integer> opponentPowers = new ArrayList<Integer>(Arrays.asList(2, 7, 0, 9, 3, 6, 0, 6, 2, 6));
			Collections.sort(gRevolutionPowers);
			System.out.println("Sorted gRevolutionPowers " + gRevolutionPowers);
			Collections.sort(opponentPowers);
			System.out.println("Sorted opponentPowers    " + opponentPowers);

			Map<Integer, Boolean> paired = new HashMap<Integer, Boolean>();
			int k = 0;
			// opponentPowers.stream().forEach(e -> paired.put(k++, false));
			for (int j = 0; j < opponentPowers.size(); j++) {
				paired.put(j, false);
			}
			// 3 6 7 5 3 5 6 2 9 1
			// 2 7 0 9 3 6 0 6 2 6
			int win = 0;
			int iterationCountergRevolutionPowers = 0;
			int iterationCounteropponentPowers = 0;
			for (int l = 0; l < gRevolutionPowers.size(); l++) {
				if(opponentPowers.get(i) >gRevolutionPowers.get(gRevolutionPowers.size() - 1)) {
					continue;
				}
				iterationCountergRevolutionPowers++;
					for (int j = 0; j < opponentPowers.size(); j++) {
						iterationCounteropponentPowers++;
						if (!paired.get(j) && gRevolutionPowers.get(l) > opponentPowers.get(j)) {
							paired.put(j, true);
							win++;
							System.out.println(
									"pair: " + "(" + gRevolutionPowers.get(l) + ", " + opponentPowers.get(j) + ")");
							System.out.println(win);
							break;
						}

					}
			}
			
			System.out.println("number of Iteration for outer loop: "+ iterationCountergRevolutionPowers );
			System.out.println("number of Iteration for inner loop: "+ iterationCounteropponentPowers );
		}
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed milliseconds: " + difference);
	}

}
