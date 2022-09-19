package SepNine.Prob1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	
	int numberOfPublications;

	public Professor(String name, LocalDate hireDate, double salary, int numberOfPublications) {
		super(name, hireDate, salary);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return super.computeSalary();
	}
	
	
}
