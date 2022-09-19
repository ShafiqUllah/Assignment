package SepThirteen.Prob3;


import java.time.LocalDate;
import java.util.GregorianCalendar;

import SepThirteen.Prob3.Enumerate.AccountType;



// Same as Employee_1, can't modify employee_1 to show the Prob3_1 part, this class is just a clone
public class Employee {
	
	private final static String DEFAULT_NICKNAME = "ALICE";
	private final static double DEFAULT_BALANCE = 0.0;
	
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDate;
	
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;


	// constructor
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		nickName = DEFAULT_NICKNAME;
		salary = DEFAULT_BALANCE;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.toZonedDateTime().toLocalDate();
	}

	// 1st part
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}
	// needs to be improved
	public LocalDate getHireDay() {
		
		return hireDate;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, hireDate.toString());
	}
	
	
	
	// 2nd part 
	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}
	
	public String getFormattedAcctInfo() {
		// implement
		String accInfo = "";
		if(checkingAcct != null){
			accInfo += "Account type: "+ checkingAcct.getAcctType()+"\n";
			accInfo += "Current bal: "+ checkingAcct.getBalance()+"\n";
		}
		
		if(savingsAcct != null){
			accInfo += "Account type: "+ savingsAcct.getAcctType()+"\n";
			accInfo += "Current bal: "+ savingsAcct.getBalance()+"\n";
		}
		
		if(retirementAcct != null){
			accInfo += "Account type: "+ retirementAcct.getAcctType()+"\n";
			accInfo += "Current bal: "+ retirementAcct.getBalance()+"\n";
		}
		return accInfo +"\n\n";
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING: {
			checkingAcct.makeDeposit(amt);
			break;
		}
		case SAVINGS: {
			savingsAcct.makeDeposit(amt);
			break;
		}
		case RETIREMENT: {
			retirementAcct.makeDeposit(amt);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + acctType);
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING: {
			return checkingAcct.makeWithdrawal(amt);
			
		}
		case SAVINGS: {
			return savingsAcct.makeWithdrawal(amt);
			
		}
		case RETIREMENT: {
			return retirementAcct.makeWithdrawal(amt);
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + acctType);
		}
	}
}
