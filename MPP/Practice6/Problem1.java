package practice6;

import java.util.Random;

import java.util.function.Supplier;


//Random r = new Random();
//() -> r.nextInt();
public class Problem1 {

	static Integer myCustomMethod() {
		return new Random().nextInt();
	}

	// name and type of lambda goes here
	Supplier<Integer> func1 = () -> new Random().nextInt();

	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method.
	Supplier<Integer> func2 = Problem1::myCustomMethod;

	// representing lambda as a static nested class
	private static class MathRandom implements Supplier<Integer> {

		@Override
		public Integer get() {
			// TODO Auto-generated method stub
			 return new Random().nextInt();
		}
	}

	public void evaluator() {
		System.out.println(func1.get());
		System.out.println(func2.get());
		System.out.println(new MathRandom().get());
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

	
}
