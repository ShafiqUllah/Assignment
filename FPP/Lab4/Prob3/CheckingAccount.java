package SepNine.Prob3;


public class CheckingAccount extends Account {
	
	private static final double MONTHLY_SERVICE_CHARGE = 0.25;

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_SERVICE_CHARGE;
	}

}
