package lab4.partc;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
		this.fica = (23 / 100) * grossPay;
		this.state = (5 / 100) * grossPay;
		this.local = (1 / 100) * grossPay;
		this.medicare = (3 / 100) * grossPay;
		this.socialSecurity = (7.5 / 100) * grossPay;
	}

	public void print() {

	}

	public double getNetPay() {
		return this.grossPay - fica - state - local - medicare - socialSecurity;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	
	

}
