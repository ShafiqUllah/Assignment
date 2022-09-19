package SepNine.Prob6.Case2;

import java.util.GregorianCalendar;

public final class PersonWithJob extends Person {
	private double salary;


	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
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
		boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth())
				&& this.salary == p.salary;
		return isEqual;
	}
}
