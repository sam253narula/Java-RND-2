package com.concurency.forkjoinpool;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolTest {

	public static void main(String[] args) {

		Callable<Void> naRunnable = checkFolderForNAAndSendMail("NA");
		Callable<Void> naigRunnable = checkFolderForNAIGAndSendMail("NAIG");
		Callable<Void> convertsRunnable = checkFolderForNAAndSendMail("CONVERTS");
		ForkJoinPool.commonPool().invokeAll(Arrays.asList(naRunnable,naigRunnable, convertsRunnable));
		

	}

	public static Callable<Void> checkFolderForNAAndSendMail(String fileLocationKey) {
		return  () -> {
				System.out.println("Checking file location of NA");
				boolean fileExist = true;
				if (fileExist) {
					sendMail(fileLocationKey);
				}
				return null;
		};
	}

	public static Callable<Void> checkFolderForNAIGAndSendMail(String fileLocationKey) {
		return  () -> {
				System.out.println("Checking file location of NAIG");
				boolean fileExist = true;
				if (fileExist) {
					sendMail(fileLocationKey);
				}
				return null;
		};
	}

	public static Callable<Void> checkFolderForCONVERTSAndSendMail(String fileLocationKey) {
		return  () -> {
			
				System.out.println("Checking file location of CONVERTS");
				boolean fileExist = true;
				if (fileExist) {
					sendMail(fileLocationKey);
				}
				return null;
		};
		
	}

	public static void sendMail(String fileLocationKey) {
		if (fileLocationKey.equalsIgnoreCase("NA"))
			System.out.println("Send mail with NA body");

		else if (fileLocationKey.equalsIgnoreCase("NAIG"))
			System.out.println("Send mail with NAIG body");

		else if (fileLocationKey.equalsIgnoreCase("CONVERTS"))
			System.out.println("Send mail with CONVERTS body");
	}
}
