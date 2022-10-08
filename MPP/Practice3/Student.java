package practice3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Role{
	
	private double GPA;
	List<Course> listOfCourses = new ArrayList<>();
	

	public Student(double gPA) {
		super();
		GPA = gPA;
	}
	
	public void addCourse(Course c) {
		listOfCourses.add(c);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getUnits() {
		// TODO Auto-generated method stub
		
		double ans = 0;
		for(Course c:listOfCourses) {
			ans += c.getUnits();
		}
		return ans;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student";
	}

}
