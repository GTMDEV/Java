package java8;

import java.util.Arrays;
import java.util.List;

public class CheckAllElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		boolean allMatch = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println(allMatch);
	}
}
