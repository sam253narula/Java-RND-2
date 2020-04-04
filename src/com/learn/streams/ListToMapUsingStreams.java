package com.learn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapUsingStreams {

	public static void main(String[] args) {
		List<LocationStats> allStats = new ArrayList<>();
		LocationStats mumbaiLoca = new LocationStats();
		mumbaiLoca.setCountry("India");
		mumbaiLoca.setLatestTotalCases(10);
		
		//int totalReportedCasesInIndia = indianStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		
		Map<String, Integer> allStatssMap = allStats.stream()
				.collect(Collectors.toMap(LocationStats::getCountry, LocationStats::getLatestTotalCases, (oldValue, newValue) -> oldValue));
	}

}
