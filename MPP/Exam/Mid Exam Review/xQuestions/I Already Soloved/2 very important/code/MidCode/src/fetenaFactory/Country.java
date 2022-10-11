package fetenaFactory;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private long location;
	private String name;
	private List<SportTeam> teams = new ArrayList();

	Country(long location, String name) {
		this.location = location;
		this.name = name;
	}
public String getNameOfCountry()
{return name;}
	public void addSportTeam(SportTeam team) {
		teams.add(team);
	}

	public double totalSalary() {
		double sum = 0;
		for (SportTeam sportTeam : teams) {
			sum += sportTeam.totalSalary();
		}

		return sum;
	}
public void country_info()
{ for(SportTeam spt: teams)
	System.out.println(name+" "+spt.getNameOfSport()+ " "+spt.getNumberOfPlayers());
	
}
}
