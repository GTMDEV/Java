package java8.employee;

import java.util.Arrays;

public class CountOfEven {

	public static void main(String[] args) {
		int[] numbers= {2,5,8,10,3,6};
		
		long evenCount = Arrays.stream(numbers).filter(num ->num % 2==0).count();
		System.out.println(evenCount);
	}
}
