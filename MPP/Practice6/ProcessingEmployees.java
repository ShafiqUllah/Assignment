package practice6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {

	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"), new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing"),
				new Employee("Wendy", "brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("#0. Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// implement here

//		1) Use the Collectors.joining method to print out All Employee objects and separate each one with a delimiter 
//of “---\n---“.
//		2) Print a list of both the capital and non-capital last names of employees using stream concat operation.
//		3) Calculate sum of Employee salaries using DoubleStream.
//		4) Calculate sum of Employee salaries with Stream’s reduce method.
//		5) Count number of Employees in each department by using groupingBy operation.
//		6) Print out each department name with the average salary by using groupingBy operation.
//		7) Print out each department and its corresponding employees by using groupingBy operation.
//		8) From given employee list, create Map<String, List<Double>> map: keys will be department names,
//and values will be salaries of the department by using groupingBy operation and show the result using forEach method.

		// 1. Use the Collectors.joining method to print out All Employee objects and
		// separate each one with a delimiter
		// of “---\n---“.
		System.out.println();
		System.out.println("#1. Use the Collectors.joining method to print out All Employee objects and "
				+ "separate each one with a delimiter \r\n" + "//of ---\\n---");
		// list.stream().map(Employee::toString)
		// .collect(Collectors.joining("---\\n---")).
		System.out.println(list.stream().map(Employee::toString).collect(Collectors.joining("\n------\n")));

//		2. Print a list of both the capital and non-capital last names of employees using stream concat operation.
		System.out.println();
		System.out.println("#2. Print a list of both the capital and non-capital last names of "
				+ "employees using stream concat operation.");

		Stream<String> streamCapital = list.stream().map(x -> x.getLastName().toUpperCase());
		Stream<String> streamNonCapital = list.stream().map(x -> x.getLastName().toLowerCase());
		
		Stream.concat(streamCapital, streamNonCapital).forEach(System.out::println);

		// 3.Calculate sum of Employee salaries using DoubleStream.
		System.out.println();
		System.out.println("#3.Calculate sum of Employee salaries using DoubleStream");
		Double salarySum = list.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum : " + salarySum);

		// 4. Calculate sum of Employee salaries with Stream’s reduce method..
		System.out.println();
		System.out.println("#4. Calculate sum of Employee salaries with Stream reduce method.");
		Double salarySum2 = list.stream().map(Employee::getSalary).reduce(0.0, (a, b) -> a + b);
		System.out.println("Sum : " + salarySum2);

		// 5 Count number of Employees in each department by using groupingBy operation.
		System.out.println();
		System.out.println("#5. Count number of Employees in each department by using groupingBy operation.");
		list.stream().collect(Collectors.groupingBy(e -> e.getDepartment()))
				.forEach((x, y) -> System.out.println("Department : " + x + " Count : " + y.size()));

		// 6 Print out each department name with the average salary by using groupingBy
		// operation.
		System.out.println();
		System.out.println("#6. Print out each department name with the average salary by using groupingBy operation.");
		list.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((x, y) -> System.out.println(
				"Department : " + x + " Average : " + y.stream().mapToDouble(Employee::getSalary).average().orElse(0.0))

		);

		// #7 Print out each department and its corresponding employees by using
		// groupingBy

		System.out.println();
		System.out.println(
				"#7. Print out each department and its corresponding employees by using groupingBy operation.");
		list.stream().collect(Collectors.groupingBy(Employee::getDepartment))
				.forEach((x, y) -> System.out.println("Department : " + x + "\n"
						+ y.stream().map(a -> a.toString()).reduce((a, b) -> a + "\n" + b).orElse("")));

		// From given employee list, create Map<String, List<Double>> map: keys will be
		// department names,
		// and values will be salaries of the department by using groupingBy operation
		// and show the result using forEach method.

		System.out.println();
		System.out.println(
				"#8. From given employee list, create Map<String, List<Double>> map: keys will be department names,\r\n"
						+ " and values will be salaries of the department by using groupingBy operation and show the result using forEach method.");
		list.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(),
						Collectors.mapping(Employee::getSalary, Collectors.toList())))
				.forEach((x, y) -> System.out.println("Department :  " + x + "\nSalary : " + y));

	}

}
