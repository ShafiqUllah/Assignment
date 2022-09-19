package SepNine.Prob2_4_5;


public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double[] arrayOfSides = {side, side, side, side};
		return arrayOfSides;
	}
	


}
