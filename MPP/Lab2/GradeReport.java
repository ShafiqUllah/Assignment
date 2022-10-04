package lab3;
public class GradeReport {
	private Student student;
	GradeReport(Student student) {
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Grade report of " + student;
	}

}
