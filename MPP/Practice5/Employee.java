package practice5;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	// constructor
	public Employee(String firstName, String lastName, double salary, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	// set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get firstName
	public String getFirstName() {
		return firstName;
	}

	// set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get lastName
	public String getLastName() {
		return lastName;
	}

	// set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// get salary
	public double getSalary() {
		return salary;
	}

	// set department
	public void setDepartment(String department) {
		this.department = department;
	}

	// get department
	public String getDepartment() {
		return department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	// return a String containing the Employee's information
	@Override
	public String toString() {
		return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartment());
	} // end method toString

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (o.equals(this))
			return 0;
		else
			return -1;

	}

	@Override
	public int hashCode() {
		return Objects.hash(department, firstName, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

} // end class Employee