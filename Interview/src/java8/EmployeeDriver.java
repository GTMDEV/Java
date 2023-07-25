package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Alice", "java developer", "female", 540000));
        employees.add(new Employee("Bob", "java developer", "male", 600000));
        employees.add(new Employee("Eve", "software engineer", "female", 500000));
        employees.add(new Employee("Charlie", "java developer", "female", 940000));
        
        List<Employee> filterdEmployees = employees.stream().filter(emp ->emp.getGender().equalsIgnoreCase("female"))
        .filter(emp -> emp.getDesignation().equalsIgnoreCase("java developer"))
        .filter(emp -> emp.getSalary()>=540000)
        .collect(Collectors.toList());
        
        filterdEmployees.forEach(System.out::println);
	}
}
