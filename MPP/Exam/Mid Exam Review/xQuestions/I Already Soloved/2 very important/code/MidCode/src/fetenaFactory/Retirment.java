package fetenaFactory;

import java.time.LocalDate;

public class Retirment extends Account {
	public LocalDate retirementDate;

	Retirment(String accountNum, double balance, double rate, LocalDate d) {
		super(accountNum, balance, rate);
		this.retirementDate = d;
	}

}
