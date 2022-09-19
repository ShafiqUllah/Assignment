package SepNine.Prob3;

import java.util.Scanner;

public class Prog4_3 {
	Employee[] emps = null; // Employee_2 is similar to Employee_1, with more functionality

	private String[] accArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prog4_3();
	}

	Prog4_3() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);

		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);

		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf(
					"A. See a report of all accounts. \nB. Make a deposit. \nC. Make a withdrawal. \nMake a selection (A/B/C): ");
			String menuChoice = sc.next();
			String info;
			if (menuChoice.equalsIgnoreCase("a")) {
				info = "\n" + getFormattedAccountInfo();
				System.out.println(info);
			} else if (menuChoice.equalsIgnoreCase("b") || menuChoice.equalsIgnoreCase("c")) {
				boolean needChoiceOption = true;
				int employeeChoice;
				do {
					info = "\n" + getAllAccountNames();
					System.out.println(info);
					System.out.print("Select an employee: (type a number) ");
					employeeChoice = sc.nextInt();
					if (employeeChoice < emps.length && employeeChoice > -1) {
						needChoiceOption = false;

					} else {
						System.out.println("\nOpps!!!!! Choose the right option\n\n");
					}
				} while (needChoiceOption);

				needChoiceOption = true;

				int accTypeChoice;
				do {

					info = "\n" + getAllAccountVarientOfAnEmployee(emps[employeeChoice]);
					System.out.println(info);
					System.out.print("Select an account: (type a number) ");
					accTypeChoice = sc.nextInt();

					if (accTypeChoice < accArr.length && accTypeChoice > -1) {
						needChoiceOption = false;
					} else {
						System.out.println("Opps!!!!! Choose the right option");
					}

				} while (needChoiceOption);

				if (menuChoice.equalsIgnoreCase("b")) {
					System.out.print("Deposit amount: ");
					double amount = sc.nextDouble();
					emps[employeeChoice].deposit(accTypeChoice, amount);

					info = "\n" + amount + " has been deposit to the " + accArr[accTypeChoice] + " account of "
							+ emps[employeeChoice].getName() + "\n\n";
					System.out.println(info);
				} else {
					info = "Withdrow amount: ";
					System.out.println(info);
					double amount = sc.nextDouble();
					if(emps[employeeChoice].withdraw(employeeChoice, amount)) {
						info = "\n" + amount + " has been withdrow from the " + accArr[accTypeChoice] + " account of "
								+ emps[employeeChoice].getName() + "\n\n";
						System.out.println(info);
					}else {
						info = "\nSorry !!!! " + amount + " can't be be withdrown from the " + accArr[accTypeChoice] + " account of "
								+ emps[employeeChoice].getName() +" due to insufficient balance.\n\n";
						System.out.println(info);
					}

					
				}
			} else {
				System.out.println("\nOpps!!!!! Choose the right option\n");
			}
		}

	}

	String getFormattedAccountInfo() {
		String result = "";
		for (int i = 0; i < emps.length; i++) {
			result += "ACCOUNT INFO FOR " + emps[i].getName() + "\n\n";
			result += emps[i].getFormattedAcctInfo();
		}
		return result;
	}

	public String getAllAccountNames() {
		String result = "";
		for (int i = 0; i < emps.length; i++) {
			result += i + "." + emps[i].getName() + "\n";
		}
		return result;
	}

	public String getAllAccountVarientOfAnEmployee(Employee e) {
		String result = "";

		accArr = e.getNamesOfAccounts();
		for (int i = 0; i < accArr.length; i++) {
			if (accArr[i] != null)
				result += i + "." + accArr[i] + "\n";
		}
		return result;
	}

}
