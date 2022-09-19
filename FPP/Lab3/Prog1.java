package SepSeven;

import SepSeven.Enumerate.AccountType;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_1 employee = new Employee_1("Shafiq", "Ullah", 100, 2021, 11, 25);
		Account[] accountArray = new Account[3];

		accountArray[0] = new Account(employee, AccountType.CHECKING, 300);
		accountArray[1] = new Account(employee, AccountType.SAVINGS, 300);
		accountArray[2] = new Account(employee, AccountType.RETIREMENT, 300);
		
		for(int i =0 ; i< accountArray.length ;i++) {
			System.out.println(accountArray[i].toString());
		}
	}

}
