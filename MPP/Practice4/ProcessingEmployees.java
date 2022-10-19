package practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"), new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("#0. Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// implement here

		// Only first name
		System.out.println();
		System.out.println("#1. Only the first name ");
		list.stream().map(e -> e.getFirstName()).forEach(System.out::println);

		// Count the number of last names that begin with the letter ‘B’. Print out this
		// number.
		System.out.println();
		System.out.print("#2. Last name begines with B , count is - ");
		System.out.println(list.stream().map(e -> e.getLastName()).filter(x -> x.startsWith('B' + "")).count());

		// Print out all the Employee objects whose last name begins with the letter
		// ‘B’.
		System.out.println();
		System.out.println("#3. Last name begines with B , Employee info - ");
		list.stream().filter(e -> e.getLastName().startsWith("B")).forEach(System.out::println);

		// Print out All of the employee objects, but if the last name begins with the
		// letter ‘I’, then capitalize all the letters in the last name.
		System.out.println();
		System.out.println("#4. Last name begines with I , Capitalized last name \nEmployee info - ");

		list.stream().filter(e -> e.getLastName().startsWith("I")).forEach(e -> {
			System.out.println(String.format("%-8s %-8s %8.2f   %s", e.getFirstName(), e.getLastName().toUpperCase(),
					e.getSalary(), e.getDepartment()));
		});


		// Print out all the Employee objects’ last names, whose last name begins with
		// the letter ‘I’, but First name does
		// not begin with the letter ‘I’. Print out only the last names.
		System.out.println();
		System.out.println(
				"#5. All Employee Last name,  with last name begines with I, \nbut first name doesn't begines with I -");

		list.stream().filter(e -> e.getLastName().startsWith("I")).filter(e -> !e.getFirstName().startsWith("I"))
		.map(e -> e.getLastName())
		.forEach(System.out::println);

		// Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually
		// print out only the first 20 even
		// numbers from this stream.

		System.out.println();
		System.out.println("#6. even number limit 20 max");
		Stream.iterate(0, x -> x + 2).limit(20).forEach(System.out::println);
		
		
		// Display Employees with salaries in the range $4000-$6000.
		System.out.println();
		System.out.println("#7. All Employee Salary range 4000 ~ 6000 ");
		list.stream().filter(e -> e.getSalary() >= 4000).filter(e ->e.getSalary() <= 6000)
		.forEach(System.out::println);

		// Display Employees in IT department.
		System.out.println();
		System.out.println("#8. All Employee in IT dep ");

		list.stream().filter(e -> e.getDepartment().equals("IT")).forEach(System.out::println);

	}

//		
} // end class ProcessingEmployees
