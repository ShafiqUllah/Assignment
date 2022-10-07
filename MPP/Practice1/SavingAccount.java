package lab3;

public class SavingAccount extends Account {

	String accId;
	double interestRate;
	double balance;
	Employee employee;

	public SavingAccount(String accId, double interestRate, double startBalance) {
		super();
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	double getBalace() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + ( interestRate  * balance);
	}

}
