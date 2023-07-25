package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDriver {

	public static void main(String[] args) {
		List<Emp> employess = Arrays.asList(new Emp("Alice", "HR", 50000), new Emp("Bob", "IT", 60000),
				new Emp("Charlie", "HR", 55000), new Emp("David", "IT", 70000), new Emp("Eva", "HR", 60000));

		Map<String, IntSummaryStatistics> collect = employess.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.summarizingInt(Emp::getSalary)));

		System.out.println(collect);
	}
}
