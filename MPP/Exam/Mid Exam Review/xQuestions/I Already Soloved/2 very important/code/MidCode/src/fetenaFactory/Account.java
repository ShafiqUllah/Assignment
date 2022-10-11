package fetenaFactory;

public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected double interestRate;

	 Account(String accountNum, double balance, double rate) {
		this.accountNumber = accountNum;
		this.balance = balance;
		this.interestRate = rate;
	}

	public  double getBalance() {
		return this.balance;
	}
}
