package practice7.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Department {
	private String name;
	private List<Person> persons;

	public Department(String name) {
		this.name = name;
		this.persons = new ArrayList<Person>();

	}

	public void addPerson(Person p) {
		this.persons.add(p);
	}

	public List<Person> getPersons() {
		return this.persons;
	}

//	public void showAllMembers() {
//
//		for (Person p : persons) {
//			System.out.print("Name: " + p.getName() + " phone: " + p.getPhone() + " age: " + p.getAge() + " role: ");
//			for (Role pRole : p.getRoles()) {
//				System.out.print(pRole.getClass().getSimpleName() + " ");
//			}
//			System.out.println("\n");
//		}
//		showAllMembersLambda();
//	}

	public void showAllMembersLambda() {

//		for(Person p: persons) {
//			System.out.print("Name: " + p.getName() + " phone: "+ p.getPhone()+ " age: "+ p.getAge() + " role: ");
//			for(Role pRole: p.getRoles()) {
//				System.out.print(pRole.getClass().getSimpleName() + " ");
//			}
//		System.out.println("\n");
//		}

		persons.stream()
				.map(x -> "Name: " + x.getName() + " phone: " + x.getPhone() + " age: " + x.getAge() + " role: " + x
						.getRoles().stream().map(xr -> xr.getClass().getSimpleName()).reduce("", (a, b) -> a + " " + b))
				.forEach(System.out::println);

	}

	public void unitsPerFaculty() {
//		for (Person p : persons) {
//			for (Role pRole : p.getRoles()) {
//				if (pRole instanceof Faculty) {
//					System.out.println("Name: " + p.getName() + " Units: " + pRole.getUnits() + "\n");
//				}
//			}
//		}

		persons.stream().filter(x -> x.getRoles().stream().anyMatch(r -> r instanceof Faculty))
				.map(x -> "Name: " + x.getName() + " Units: " + x.getRoles().stream().filter(r -> r instanceof Faculty)
						.map(Role::getUnits).reduce(0.0, (a, b) -> a + b))
				.forEach(System.out::println);
		


	}

	public double getTotalSalary() {
//		double sumSalary = 0.0;
//		for(Person p: persons) {
//			for(Role pRole: p.getRoles()) {
//				sumSalary+= pRole.getSalary();
//			}
//		}
//		
//		return sumSalary;

		return persons.stream().flatMap(x -> x.getRoles().stream()).mapToDouble(x -> x.getSalary()).reduce(0.0,
				(a, b) -> a + b);
	}
}
