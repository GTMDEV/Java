package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 2, 3, 4, 4, 5, 5, 6 };
		removeduplicate(numbers);
	}

	public static void removeduplicate(int[] nums) {
		List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		List<Integer> unquieList = numList.stream().distinct().collect(Collectors.toList());
		/*System.out.println("unquie element");
		for (int num : unquieList) {
			System.out.print(num);
		}
		System.out.println();
	}*/
		System.out.println(unquieList);
	}

}
