package lab3;
public class Student {
	private String name;
	private GradeReport gradeReport;
	Student(String name) {
		this.name = name;
		gradeReport = new GradeReport(this);
	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
