package SepNine.Prob3;



class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}


	public String toString() {
		return "type = "  + employee.getName()+ ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance = this.balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > this.balance)
			return false;
		else {
			this.balance = this.balance - amount;
			return true;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	AccountType getAcctType() {
		return null;
	}

}
