package lab12;

public class Square extends ClosedCurve {
	double side;

	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}

	public Square(double side) throws IllegalClosedCurveException {
		if (side < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a "+ this.toString()+" instance");
		else {
			this.side = side;
		}

	}

	double computeArea() {
		return (side * side);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}
