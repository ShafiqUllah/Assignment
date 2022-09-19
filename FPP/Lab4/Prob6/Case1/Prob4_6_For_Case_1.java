package SepNine.Prob6.Case1;

import java.util.GregorianCalendar;

public class Prob4_6_For_Case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Shafiq", new GregorianCalendar(1993, 12, 31));
		PersonWithJob personWithJob = new PersonWithJob("Shafiq", new GregorianCalendar(1993, 12, 31), 1000);
		
		System.out.println(person.equals(personWithJob)); 

		System.out.println(personWithJob.equals(person)); 
	}

}
