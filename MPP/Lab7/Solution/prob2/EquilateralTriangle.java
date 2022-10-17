package lab7.prob2;

public class EquilateralTriangle implements Polygon {

	private double arm;

	public EquilateralTriangle(double arm) {
		super();
		this.arm = arm;
	}

	public double getArm() {
		return arm;
	}

	@Override
	public double[] getLengths() {
		// TODO Auto-generated method stub
		double[] a = { arm, arm, arm };
		return a;
	}

}
