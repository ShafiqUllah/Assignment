package lab3;

public class CheckingAccount extends Account {

	double balance;
	double monthlyFee;
	String accId;

	public CheckingAccount(String accId, double fee, double startBalance) {
		super();
		this.balance = startBalance;
		this.monthlyFee = fee;
		this.accId = accId;
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
		return balance - monthlyFee;
	}

}
