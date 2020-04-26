package com.mirosoft.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//1
//10
//3 6 7 5 3 5 6 2 9 1 
//2 7 0 9 3 6 0 6 2 6 
public class BayladeSolution {

	public static void main(String[] args) throws IOException {

		/// Number of test cases
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String noOfTestCasesString = br.readLine();
		int noOfTestCases = Integer.parseInt(noOfTestCasesString.trim());
		for (int i = 0; i < noOfTestCases; i++) {
			// Number of opponents
			int noOfOpponents = Integer.parseInt(br.readLine());
			List<Long> opponentPowers = new ArrayList<Long>();
			List<Long> gRevolutionPowers = new ArrayList<Long>();
			// GReolution Powers
			for (int j = 0; j < noOfOpponents; j++) {
				gRevolutionPowers.add(Long.valueOf(br.readLine()));
//				Long gRevolutionPower = Long.parseLong(br.readLine());
//				gRevolutionPowers.add(gRevolutionPower);
			}
			// Opponent Powers
			for (int k = 0; k < noOfOpponents; k++) {
				opponentPowers.add(Long.valueOf(br.readLine()));
//				Long opponentPower = Long.parseLong(br.readLine());
//				opponentPowers.add(opponentPower);
			}
			Long win = (long) 0;
			Collections.sort(gRevolutionPowers);
			// this map maintains all pairs of elements whicha re match
			Map<Integer, Boolean> paired = new HashMap<Integer, Boolean>();
			for (int j = 0; j < opponentPowers.size(); j++) {
				paired.put(j, false);
			}
			for (Long gRevolutionPower : gRevolutionPowers) {
				for (int j = 0; j < opponentPowers.size(); j++) {
					if (!paired.get(j)) {
						if (gRevolutionPower > opponentPowers.get(j)) {
							paired.put(j, true);
							win++;
							break;

						}
					}
				}
			}
			System.out.println(win);

		}

	}

}
