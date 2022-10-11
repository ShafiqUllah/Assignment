package fetenaFactoryMain;

import java.time.LocalDate;
import java.util.List;

import fetenaFactory.Athlete;
import fetenaFactory.Country;
import fetenaFactory.Factory;
import fetenaFactory.SportTeam;

public class Main {

	public static void main(String[] args) {

		Country ctry = Factory.createCountry(331_893_745L, "USA");

		SportTeam sp1 = Factory.createSportTeam(ctry, "Soccer", 20);
		SportTeam sp2 = Factory.createSportTeam(ctry, "Basketball", 15);

		Athlete a1 = Factory.createAthlete(sp1, "Christian Pulisic", 60000);
		Athlete a2 = Factory.createAthlete(sp1, "John Brooks", 75000);
		Athlete a3 = Factory.createAthlete("Kevin Durant", 72000);
		Athlete a4 = Factory.createAthlete("Devin Booker", 83000);
		Athlete a5 = Factory.createAthlete("John Conner", 98000);
		
		Factory.addAthlete(sp2, a3);
		Factory.addAthlete(sp2, a4);
		Factory.addAthlete(sp1, a5);
		List<Athlete> athletes = List.of(a1, a2, a3, a4, a5);
		int i = 0;
		for (Athlete a : athletes) {
			i++;
			Factory.createChecking("0100" + i, 15000, 0.01, a);
			Factory.createSaving("0200" + i, 20000, 0.05, a);
		}

		Factory.createRetirement("03000", 35000, 0.02, LocalDate.now(), a5);

		System.out.println(ctry.totalSalary());
		
		
		
       ctry.country_info();
//Output is 388,000
//USA Soccer 20
//USA Basketball 15
		System.out.println("Average balance for SportTeam spl: " + sp1.averageBalance());
//Average balance for SportTeam sp1: 20000.0
		System.out.println("Highest salary for SportTeam spl:" + sp1.highestSalary());
//Highest salary for SportTeam sp1: 98000.0
		
	}
}