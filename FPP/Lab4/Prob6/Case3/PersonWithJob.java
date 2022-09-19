package SepNine.Prob6.Case3;

import java.util.GregorianCalendar;

public final class PersonWithJob {
	private double salary;
	private Person person;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
		if (withJob.getClass() != this.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = p.person.equals(person) && p.person.getName().equals(person.getName())
				&& p.person.getDateOfBirth().equals(person.getDateOfBirth()) && this.salary == p.salary;
		return isEqual;
	}
}
