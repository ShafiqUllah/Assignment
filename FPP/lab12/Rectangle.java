package lab12;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if(length < 0 || width < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a "+ this.toString()+" instance");
		else {
			this.length = length;
			this.width = width;
		}
	}
	double computeArea() {
		return width*length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}
