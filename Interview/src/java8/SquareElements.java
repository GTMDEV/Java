package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> collect = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(collect);
	}
}
