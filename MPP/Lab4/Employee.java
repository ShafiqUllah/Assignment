package lab4.partc;

public abstract class Employee {
	private int empId;
	
	public void print() {
		
	}
	
	//Template method
	public Paycheck calcCompensation(int month,int year) {
		return new Paycheck(calcGrossPay(month, year));
	}
	
	public abstract double calcGrossPay(int month, int yr) ;
}
