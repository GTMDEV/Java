package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterringString {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Goutam","Pandurang","Parvati","Nagamma","ramanna");
		List<String> collect = names.stream().filter(name ->name.length()>4)
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}