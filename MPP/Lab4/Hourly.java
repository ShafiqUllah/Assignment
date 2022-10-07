package lab4.partc;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	
	

	public Hourly(double hourlyWage, double hoursPerWeek) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}



	@Override
	public double calcGrossPay(int month, int yr) {
		// TODO Auto-generated method stub
		return hoursPerWeek * hourlyWage * 4;
	}



	public double getHourlyWage() {
		return hourlyWage;
	}



	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
	

}
