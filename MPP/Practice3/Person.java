package practice3;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String phone;
	private int age;
	
	List<Role> listOfRoles = new ArrayList<>();
	
	public Person(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	
	public List<Role> getRoles(){
		return listOfRoles;
	}
	
	public void addRole(Role r) {
		listOfRoles.add(r);
	}


	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}


	public int getAge() {
		return age;
	}


	
	
	

}
