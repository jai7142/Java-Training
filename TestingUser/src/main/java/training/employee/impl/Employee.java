package training.employee.impl;

class Employee {

	String name;
	double salary;
	String department;
	int age;

	public Employee(String name, double salary, String department, int age) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}
}