package string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String[] wordArray = { "anup", "sai", "goutam", "anup", "sam" };
		Map<String, Long> collect = Arrays.stream(wordArray)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect);
	}

}
