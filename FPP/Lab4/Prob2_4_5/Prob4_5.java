/**
 * 
 */
package SepNine.Prob2_4_5;

/**
 * @author User
 *
 */
public class Prob4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polygon[] objects = { new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };

		// compute Perimeter
		for (Polygon cc : objects) {

			System.out.println(
					"For this " + cc.getClass().getSimpleName() + " \n   Perimeter = " + cc.computePerimeter());

		}

	}

}
