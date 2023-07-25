package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSalary {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000, 60000, 75000, 80000, 90000);
		int minmumSalary = 70000;

		OptionalDouble average = salaries.stream().filter(salary -> salary > minmumSalary).mapToInt(Integer::intValue)
				.average();

		if (average.isPresent()) {
			System.out.println("Average salary above " + minmumSalary + ":" + average.getAsDouble());
		} else {
			System.out.println("No salaries above: " + minmumSalary);
		}
	}
}
