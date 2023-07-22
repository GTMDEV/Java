package java8.employee;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] number= {10,5,8,20,3};
		Integer secondLarget = Arrays.stream(number).boxed().sorted((a ,b)->b-a)
		.distinct()
		.skip(1).findFirst().orElse(-1);
		
		System.out.println(secondLarget);
	}
}
