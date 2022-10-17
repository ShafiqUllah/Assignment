package lab7.prob2;

public class Ellipse implements ClosedCurve {

	double a, E;

	public Ellipse(double a, double E) {
		super();
		this.a = a;
		this.E = E;
	}

	public double getMajorAxis() {
		return a;
	}

	public double getMinorAxis() {
		return E;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		 return 4*a*E;
	}

}
