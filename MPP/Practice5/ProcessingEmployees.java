package practice5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProcessingEmployees {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"), new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")};

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("#0. Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// implement here

		/*
		 * 
		 * 1. Display the first Employee with a salary in the range of $4000-$6000. 2.
		 * Print out all the distinct last names whose last name starts with “I”. 3.
		 * Display Employees with salaries in the range of $4000-$6000 sorted into
		 * ascending order by department. 4. Sort employees in descending order by the
		 * last name, then first name. 5. Display last names of unique employees in
		 * sorted order.
		 */

		// 1. Display the first Employee with a salary in the range of $4000-$6000.
		System.out.println();
		System.out.println("#1. Display the first Employee with a salary in the range of $4000-$6000 ");
		System.out.println(list.stream().filter(e -> e.getSalary() >= 4000).filter(e -> e.getSalary() <= 6000)
				.findFirst().orElseGet(() -> new Employee("Unknown", "Unknown", 0.0, "Unknown")));

//		2.Print out all the distinct last names whose last name starts with “I”.
		System.out.println();
		System.out.println("#2. Print out all the distinct last names whose last name starts with I");

		list.stream().filter(e -> e.getLastName().startsWith("I")).map(e -> e.getLastName()).distinct()
				.forEach(System.out::println);

		// 3. Display Employees with salaries in the range of $4000-$6000 sorted into
		// ascending order by department.

		System.out.println();
		System.out.println("#3. Display Employees with salaries in the range of $4000-$6000 sorted "
				+ "into ascending order by department");
		list.stream().filter(e -> e.getSalary() >= 4000).filter(e -> e.getSalary() <= 6000)
				.sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);
		
		//4. Sort employees in descending order by the last name, then first name.
		System.out.println();
		System.out.println("#4. Sort employees in descending order by the last name, then first name.");
		list.stream().sorted(Comparator.comparing(Employee::getLastName)
				.thenComparing(Employee::getFirstName).reversed()).forEach(System.out::println);
		
		//Display last names of unique employees in sorted order.
		System.out.println();
		System.out.println("#5. Display last names of unique employees in sorted order.");
		list.stream().sorted(Comparator.comparing(Employee::getLastName))
		.distinct().map(Employee::getLastName).forEach(System.out::println);
	}

}
