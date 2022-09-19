/**
 * 
 */
package SepNine.Prob2_4_5;

/**
 * @author User
 *
 */
public interface Polygon {
	
	public int getNumberOfSides();
	public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double sum = 0;
		for(double value: arr) {
			sum += value;
		}
		
		return sum;
	}
	
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}

}
