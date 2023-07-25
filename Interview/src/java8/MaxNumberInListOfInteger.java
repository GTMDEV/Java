package java8;

import java.util.Arrays;
import java.util.List;

public class MaxNumberInListOfInteger {

	public static void main(String[] args) {
		 List<Integer>numbers= Arrays.asList(10,5,8,20,3);
		
		 int maxElement = numbers.stream().mapToInt(Integer::intValue)
		 .max().orElse(-1);
		 
		 System.out.println(maxElement);
	}
}
