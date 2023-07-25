package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 1, 1 };
		Integer mostFrequent = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(0);

		System.out.println(mostFrequent);
	}
}
