package java8;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 8, 20, 15 };
		int asInt = Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().getAsInt();

		System.out.println(asInt);
	}
}
