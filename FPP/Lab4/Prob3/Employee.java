package SepNine.Prob3;


import java.time.LocalDate;
import java.util.GregorianCalendar;


// Same as Employee_1, can't modify employee_1 to show the Prob3_1 part, this class is just a clone
public class Employee {
	
	private final static String DEFAULT_NICKNAME = "ALICE";
	private final static double DEFAULT_BALANCE = 0.0;
	
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDate;
	
	private AccountList accounts;
	private MyStringList namesOfAccountsOfEmployee;
	
	// constructor
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		nickName = DEFAULT_NICKNAME;
		salary = DEFAULT_BALANCE;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.toZonedDateTime().toLocalDate();
		
		accounts = new AccountList();
		namesOfAccountsOfEmployee = new MyStringList();
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

	public void createNewChecking(double startAmount) {
		// implement
		Account acct = new CheckingAccount(this,startAmount);
		accounts.add(acct);
		namesOfAccountsOfEmployee.add("checking");
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account acct = new SavingsAccount(this,startAmount);
		accounts.add(acct);
		namesOfAccountsOfEmployee.add("saving");
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account acct = new RetirementAccount(this,startAmount);
		accounts.add(acct);
		namesOfAccountsOfEmployee.add("retirement");
	}
	
	
	public String getFormattedAcctInfo() {
		// implement
		
		String accInfo = "";
		for(int i= 0; i< accounts.size(); i++) {
			accInfo += "Account type: "+ accounts.get(i).getAcctType()+"\n";
			accInfo += "Current bal: "+ accounts.get(i).getBalance()+"\n";
		}
		
		return accInfo +"\n\n";
	}

	public void deposit(int accountIndex, double amt) {
		// implement
		accounts.get(accountIndex).makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		// implement
		return accounts.get(accountIndex).makeWithdrawal(amt);
	}
	
	public String[] getNamesOfAccounts() {
		return namesOfAccountsOfEmployee.toStringArray();
	}
	
}
