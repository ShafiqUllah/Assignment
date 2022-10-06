package lab3.prob3;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;

		for (int i = 0; i < properties.length; i++) {
			totalRent += properties[i].computeRent();
		}
		return totalRent;
	}
}
