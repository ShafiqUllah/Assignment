package practice3;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Role{
	
	private double salary;
	List<Course> listOfCourses = new ArrayList<>();
	
	

	public Faculty(double salary) {
		super();
		this.salary = salary;
	}
	
	
	public void addCourse(Course c) {
		listOfCourses.add(c);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public double getUnits() {
		// TODO Auto-generated method stub
		double ans =0;
		
		for(Course c: listOfCourses) {
			ans += c.getUnits();
		}
		return ans;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Faculty";
	}
	

}
