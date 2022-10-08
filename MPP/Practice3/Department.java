package practice3;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	List<Person> listOfPersons = new ArrayList<>();

	public Department(String name) {
		super();
		this.name = name;
	}

	public double getTotalSalary() {
		double ans = 0;

		for (Person p : listOfPersons) {
			for (Role r : p.getRoles()) {
				if (r instanceof Faculty || r instanceof Staff) {
					ans += r.getSalary();
				}
			}
		}
		return ans;
	}

	public void showAllMembers() {
		//// shows the name, phone number, age and role (student, faculty or
		// staff) of all members in the department.

		StringBuilder sb = new StringBuilder();

		for (Person p : listOfPersons) {
			sb.append("Name : " + p.getName()+"\n");
			sb.append("Phone Number : " + p.getPhone()+"\n");
			sb.append("Age : " + p.getAge()+"\n");
			sb.append("Role : " + p.getRoles()+"\n");
			
			for(Role r : p.getRoles()) {
				if(r instanceof Staff) {
					
					
				}
			}
		}

		System.out.println(sb.toString());

	}
	
	

	public void unitsPerFaculty() {
		// shows a list of all faculty names and the total number of units they
		// teach.
		
		//John Karry is Staff and Student. He took CS301 and CS360 courses. His GPA is 3.98. His salary
		//is 5700. 

		StringBuilder sb = new StringBuilder();
		
		for (Person p : listOfPersons) {
			for (Role r : p.getRoles()) {
				if (r instanceof Faculty) {
					sb.append("Faculty Name is "+ p.getName()+"\n");
					sb.append("Units they teach : "+ r.getUnits()+"\n");
				}
			}
		}
		
		System.out.println(sb.toString());

	}

	public void addPerson(Person p) {
		listOfPersons.add(p);
	}

}
