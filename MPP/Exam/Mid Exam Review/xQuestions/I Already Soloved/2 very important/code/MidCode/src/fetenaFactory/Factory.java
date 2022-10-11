package fetenaFactory;

import java.time.LocalDate;

public class Factory {
	private Factory() {
	}

	public static Country createCountry(long p, String n) {
		if (n == null)
			throw new NullPointerException("Country name can not be null");
		Country c = new Country(p, n);
		return c;
	}

	
public static SportTeam createSportTeam(Country country, String name, int no) {
		if (country == null)
			throw new NullPointerException("Country name can not be null");
		if (name == null)
			throw new NullPointerException("name can not be null");
		SportTeam st = new SportTeam(name, no);
		country.addSportTeam(st);
		st.setCountry(country);
		return st;
	}
	public static SportTeam createSportTeam(String name, int no) {
		if (name == null)
			throw new NullPointerException("name can not be null");
		SportTeam st = new SportTeam(name, no);
		return st;
	}

	
	public static Athlete createAthlete(SportTeam team, String name, double salary) {
		if (team == null)
			throw new NullPointerException("team name can not be null");
		if (name == null)
			throw new NullPointerException("name can not be null");
		Athlete athlete = new Athlete(name, salary);
		team.addAthlete(athlete);
		athlete.setSportTeam(team);
		return athlete;
	}
	public static Athlete createAthlete(String name, double salary) {
		if (name == null)
			throw new NullPointerException("name can not be null");
		Athlete athlete = new Athlete(name, salary);
		return athlete;
	}


	public static Account createSaving(String str, double b, double intr, Athlete a) {
		if (a == null)
			throw new NullPointerException(" null athlete");
		Account acct = new Saving(str, b, intr);
		a.addAccount(acct);
		return acct;

	}

	public static Account createChecking(String str, double b, double intr, Athlete a) {
		if (a == null)
			throw new NullPointerException(" null athlete");
		Account acct = new Checking(str, b, intr);
		a.addAccount(acct);
		return acct;
	}

	public static Account createRetirement(String str, double b, double intr, LocalDate date, Athlete a) {
		if (a == null)
			throw new NullPointerException(" null athlete");
		Account acct = new Retirment(str, b, intr, date);
		a.addAccount(acct);
		return acct;
	}

	public static void addSportTeam(Country country, SportTeam team) {
		if (country == null)
			throw new NullPointerException(" null Country");
		country.addSportTeam(team);
		team.setCountry(country);
	}

	public static void addAthlete(SportTeam team, Athlete athlete) {
		if (team == null)
			throw new NullPointerException(" null Sport team");
		team.addAthlete(athlete);
		athlete.setSportTeam(team);
	}

	public static void addAccount(Athlete athlete, Account acct) {
		if (athlete == null)
			throw new NullPointerException(" null athlete");
		athlete.addAccount(acct);
	}

}