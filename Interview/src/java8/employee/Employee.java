package java8.employee;

public class Employee {

	private String name;
	private String designation;
	private String gender;
	private double salary;

	public Employee(String name, String designation, String gender, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", gender=" + gender + ", salary=" + salary
				+ "]";
	}

}
