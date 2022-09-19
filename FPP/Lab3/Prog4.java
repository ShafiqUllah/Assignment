package SepSeven;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangle1 = new Triangle(12, 4);
		Triangle triangle2 = new Triangle(3, 4, 5);
		Triangle triangle3 = new Triangle(3, 4, 100);
		Rectangle rectangle = new Rectangle(10, 8);
		Circle circle = new Circle(2);

		System.out.println("Area of Triangle is " + triangle1.computeArea());
		System.out.println("Area of Triangle is " + triangle2.computeArea());
		System.out.println("Area of Triangle is " + triangle3.computeArea());
		System.out.println("Area of Rectangle is " + rectangle.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
	}

}
