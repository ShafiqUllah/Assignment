package lab3;

public class Prob2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("Shafiq");
		
		GradeReport gradeReport = student.getGradeReport();
		
		System.out.println(student);
		System.out.println(gradeReport);
	}

}
