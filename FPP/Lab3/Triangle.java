package SepSeven;

import java.util.Arrays;

public final class Triangle {

	private final double base;
	private final double height;
	private final double side_1;
	private final double side_2;
	private final double side_3;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		this.side_1 = 0;
		this.side_2 = 0;
		this.side_3 = 0;
	}

	public Triangle(double side_1, double side_2, double side_3) {
		super();
		this.base = 0;
		this.height = 0;
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		if (height != 0)
			return (base * height) / 2;
		else if (isTriangleValid(side_1, side_2, side_3)) {
			double[] arr = { side_1, side_2, side_3 };
			Arrays.sort(arr);
			double x = arr[0];
			double y = arr[1];
			double z = arr[2]; // Base
			double u = (y * y - x * x + z * z) / (2 * z);
			double h = Math.sqrt(y * y - u * u);
			
			

			return (h * z) / 2;
		}else {
			System.out.println("Invalid argument !!!!");	
		}

		
		return -1;
	}

	

	private boolean isTriangleValid(double a, double b, double c) {
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			return true;
		} else {
			return false;
		}
	}

}
