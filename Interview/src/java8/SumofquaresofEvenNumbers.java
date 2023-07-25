package java8;

import java.util.Arrays;
import java.util.List;

public class SumofquaresofEvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(2,5,8,10,3,6);
		int sumOfSqures = numbers.stream().filter(num -> num %2==0)
		.mapToInt(num -> num * num)
		.sum();
		System.out.println(sumOfSqures);
		//System.out.println(2*2+8*8+10*10+6*6);
	}

}
