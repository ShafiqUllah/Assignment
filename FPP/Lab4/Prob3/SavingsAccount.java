package SepNine.Prob3;


public class SavingsAccount extends Account {

	private static final double MONTHLY_INTEREST = 0.25;

	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST / 100) * baseBalance;
		return baseBalance + interest;
	}

}
