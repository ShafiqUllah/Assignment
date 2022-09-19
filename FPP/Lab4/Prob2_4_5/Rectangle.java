package SepNine.Prob2_4_5;



public class Rectangle extends ClosedCurve implements Polygon{
	
	double width;
	double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] arrayOfSides = {width, width, height, height};
		return arrayOfSides;
	}

	
	

}
