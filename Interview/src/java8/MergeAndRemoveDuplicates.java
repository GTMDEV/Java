package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndRemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> l2 = Arrays.asList(3, 4, 5, 6);
		List<Integer> mergedAndDistinct = Stream.concat(l1.stream(), l2.stream()).distinct()
				.collect(Collectors.toList());

		System.out.println(mergedAndDistinct);

	}
}
