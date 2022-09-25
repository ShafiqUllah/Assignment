package lab12;

public class Circle extends ClosedCurve {
	double radius;

	public Circle(Double radius) throws IllegalClosedCurveException {
		this(radius.doubleValue());
	}

	public Circle(double radius) throws IllegalClosedCurveException {
		if (radius < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a "+ this.toString()+" instance");
		else
			this.radius = radius;
	}

	double computeArea() {
		return (Math.PI * radius * radius);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
}
