package lab3;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	
	List<Account> listOfAccounts = new ArrayList<>();
	
	

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addAccount(Account account) {
		listOfAccounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double sum  = 0;
		for(Account acc : listOfAccounts) {
			sum += acc.computeUpdatedBalance();
		}
		return sum;
	}
}
