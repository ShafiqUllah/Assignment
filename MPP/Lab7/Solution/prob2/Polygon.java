package lab7.prob2;

public interface Polygon extends ClosedCurve {

	double[] getLengths();

	default double computePerimeter() {
		double ans = 0;
		for (double d : getLengths()) {
			ans +=d;
		}
		return ans;
		
	}
	
	
	
	

}
