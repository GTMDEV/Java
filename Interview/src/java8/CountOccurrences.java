package java8;

import java.util.Arrays;
import java.util.List;

public class CountOccurrences {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "kiwi");
		String targetFruit = "apple";
		long count = fruits.stream().filter(f -> f.equals(targetFruit)).count();
		System.out.println(count);
	}
}
