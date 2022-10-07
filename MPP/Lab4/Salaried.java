package lab4.partc;

public class Salaried extends Employee{
	
	private double salary;

	public Salaried(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int yr) {
		// TODO Auto-generated method stub
		return salary;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	

}
