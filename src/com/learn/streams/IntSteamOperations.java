package com.learn.streams;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

//IntSteams, creating Intstreams and displaying it's values
public class IntSteamOperations {

	public static void main(String[] args) {
		int[] values = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };
		// display original values
		System.out.print("Original Values using lambda in int streams: ");
		// lambda way below:
		IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		System.out.print("Original Values using Anonymous class in int streams: ");
		// Anonymous class way below:
		IntStream.of(values).forEach(new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.printf("%d ", value);
			}
		});
		System.out.println();
		// count, min, max, sum and avg of the values
		System.out.printf("\n Count: %d%n", IntStream.of(values).count());
		System.out.printf("\n Min: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("\n Max: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("\n Sum: %d%n", IntStream.of(values).sum());
		System.out.printf("\n Average: %f%n", IntStream.of(values).average().getAsDouble());
	}

}
