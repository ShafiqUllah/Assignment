package SepNine.Prob3;


public class RetirementAccount extends Account {

	private static final double PENALTY_AMOUNT = 2;

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		// TODO Auto-generated method stub
		double afterPenaltyAmount = amount - (amount * PENALTY_AMOUNT) / 100;
		return super.makeWithdrawal(afterPenaltyAmount);
	}

}
