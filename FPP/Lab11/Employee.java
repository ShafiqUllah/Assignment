package lab11;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<>();

	public void addEntry(String date, double salary) {
		// implement
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		// implement
		if (salaryRecord.containsKey(date)) {
			System.out.println(
					this.firstName + " " + this.lastName + " was paid " + salaryRecord.get(date) + " on " + date);
		} else {
			System.out.println(this.firstName + " " + this.lastName + " did not receive a paycheck on " + date);
		}
	}

	public void printAveragePaycheck() {
		// implement
		double total =0;
		for(double salary: salaryRecord.values()) {
			total += salary;
		}
		
		total = total / salaryRecord.size();
		
		System.out.println("Average paycheck for "+this.firstName + " " + this.lastName + " was " + total);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
