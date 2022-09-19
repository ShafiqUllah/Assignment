package SepSeven;

import SepSeven.Enumerate.AccountType;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	private AccountType acctType;
	private Employee_1 employee;

	private Employee employee_2;

	Account(Employee_1 emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	// For 2nd part of the assignment, this is basically same, but to show the Date
	// assignment task , i need to create 2 separate class.
	Account(Employee emp, AccountType acctType, double balance) {
		employee_2 = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee_1 emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
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

	public AccountType getAcctType() {
		return acctType;
	}

	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(new Employee_1("Shafiq", "Ullah", DEFAULT_BALANCE, 0, 0, 0), AccountType.CHECKING,
				DEFAULT_BALANCE);

		System.out.println(acc.toString());

		acc.makeDeposit(100.25);
		System.out.println(acc.toString());

		
		if (acc.makeWithdrawal(200.50)) {
			System.out.println("Transection OK");
		} else {
			System.out.println("Limit exceded, Transection Failed !!!!");
		}

		System.out.println(acc.employee.getHireDay().toString());
	}
}
