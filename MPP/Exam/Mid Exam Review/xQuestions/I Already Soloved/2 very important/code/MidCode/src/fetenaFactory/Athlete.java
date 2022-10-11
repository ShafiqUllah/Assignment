package fetenaFactory;

import java.util.ArrayList;
import java.util.List;

public class Athlete {
	private String name;
	private double salary;
	private SportTeam team;
	private List<Account> accounts = new ArrayList<>();

	 Athlete(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void addAccount(Account account) {
		accounts.add(account);
	}

	public double getSalary() {
		return this.salary;
	}

	public double getTotalBalance() {
		double totalBal = 0;
		for (Account account : accounts) {
			totalBal += account.getBalance();
		}
		return totalBal;
	}

	public int getNumberOfAccount() {
		return this.accounts.size();
	}

	public void setSportTeam(SportTeam team) {
		this.team = team;
	}

}
