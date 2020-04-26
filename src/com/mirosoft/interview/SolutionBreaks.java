package com.mirosoft.interview;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class SolutionBreaks {
    public static void main(String args[] ) throws Exception {

    	//Write code here
       Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for (int i = 0; i < noOfTestCases; i++) {
			int noOfOpponents =  sc.nextInt();
			List<Long> opponentPowers = new ArrayList<Long>();
			List<Long> gRevolutionPowers =new ArrayList<Long>();
			for (int j = 0; j < noOfOpponents; j++) {
				long gRevolutionPower = sc.nextLong();
				gRevolutionPowers.add(gRevolutionPower);
			}
			for (int k = 0; k < noOfOpponents; k++) {
				long opponentPower = sc.nextLong();
				opponentPowers.add(opponentPower);
			}
            Collections.sort(gRevolutionPowers);
            Collections.sort(opponentPowers);
           int win = 0;
           boolean breaker = false;
			  int lastIndex = gRevolutionPowers.size()-1;
	        for (int  l= 0; l < gRevolutionPowers.size(); l++) {
            if(breaker) {
					break;
				}
				for (int j = 0; j < opponentPowers.size(); j++) {
                 if(opponentPowers.get(j) > gRevolutionPowers.get(lastIndex)) {
							breaker = true;
							break;
						}
					if(gRevolutionPowers.get(l) > opponentPowers.get(j)) {
                        opponentPowers.remove(j);
						win++;
						break;
					}
				}
			}
            System.out.println(win);
			
		}
   }
}
