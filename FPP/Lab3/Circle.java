package SepSeven;

public final class Circle {
	
	private final double radious;

	public Circle(double radious) {
		super();
		this.radious = radious;
	}

	public double getRadious() {
		return radious;
	}
	
	public double computeArea() {
		return Math.PI * radious * radious;
	}

}
