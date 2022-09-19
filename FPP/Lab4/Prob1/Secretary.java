package SepNine.Prob1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	
	double overtimeHours;
	
	

	public Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
		super(name, hireDate, salary);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		
		return super.computeSalary() + 12 * getOvertimeHours();
	}

}
