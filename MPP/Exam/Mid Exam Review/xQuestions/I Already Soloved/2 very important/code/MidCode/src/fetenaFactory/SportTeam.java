package fetenaFactory;

import java.util.ArrayList;
import java.util.List;

public class SportTeam {

	private String nameOfSport;
	private int numberOfPlayers;
	private Country country;
	private List<Athlete> athletes = new ArrayList<Athlete>();

	SportTeam(String nameOfSport, int number) {
		this.nameOfSport = nameOfSport;
		this.numberOfPlayers = number;
	}

	public void addAthlete(Athlete athlete) {
		athletes.add(athlete);
	}

	public double totalSalary() {
		double totalSal = 0;
		for (Athlete athlete : athletes) {
			totalSal += athlete.getSalary();
		}
		return totalSal;
	}

	public String getNameOfSport() {
		return this.nameOfSport;
	}

	public int getNumberOfPlayers() {
		return this.numberOfPlayers;
	}

	public void setCountry(Country c) {
		this.country = c;
	}

	public double averageBalance() {
		double avgBalance=0;
		double sumOfBalance=0;
		double sumOfAccount=0;
		for(Athlete at: athletes)
			{sumOfBalance+=at.getTotalBalance();
			sumOfAccount+=at.getNumberOfAccount();
			}
		avgBalance=sumOfBalance/sumOfAccount;
		
		return avgBalance;
	}

	public double highestSalary() {
		double max = athletes.get(0).getSalary();
		for (int i = 0; i < athletes.size(); i++) {
			if (athletes.get(i).getSalary() > max) {
				max = athletes.get(i).getSalary();
			}
		}
		return max;
	}

}
