package SepNine.Prob1;

import java.time.LocalDate;

public class DeptEmployee {
	
	//name and hire date
	
	String name;
	LocalDate hireDate;
	double salary = 0;

	public DeptEmployee(String name, LocalDate hireDate, double salary) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}
	
	
	
}
