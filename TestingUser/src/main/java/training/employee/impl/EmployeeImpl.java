package training.employee.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 60000, "IT", 30),
				new Employee("Bob", 45000, "HR", 25),
				new Employee("Charlie", 55000, "IT", 35),
				new Employee("David", 30000, "Finance", 40),
				new Employee("Eve", 70000, "IT", 29));
		
		employees.stream().filter(e -> e.getSalary() > 50000).
				collect(Collectors.toMap(Employee::getName, Employee::getSalary));

		double totalSal = employees.stream()
				.filter(d -> d.getSalary() > 50000)
				.map(Employee::getSalary)
				.reduce(0.0, Double::sum);
		
	}


}
