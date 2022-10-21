package practice5;

import java.util.function.BiFunction;

import practice4.Problem1.LamdaClass;

//( x,  y) -> x + y < x * y
public class Problem1 {

	static boolean myCustomMethod(int x, int y) {
		return x + y < x * y;
	}

	// name and type of lambda goes here
	BiFunction<Integer, Integer, Boolean> func1 = (x, y) -> x + y < x * y;

	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method.
	BiFunction<Integer, Integer, Boolean> func2 = Problem1::myCustomMethod;

	// representing lambda as a static nested class
	static LamdaClass<Integer, Integer, Boolean> ILamdaClass = (x, y) -> x + y < x * y;

	// evaluate with String inputs: 2, 3
	public void evaluator() {

		String a = "2";
		String b = "3";

		System.out.println(func1.apply(Integer.parseInt(a), Integer.parseInt(b)));
		System.out.println(func2.apply(Integer.parseInt(a), Integer.parseInt(b)));
		System.out.println(ILamdaClass.myCompare(Integer.parseInt(a), Integer.parseInt(b)));
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

	public interface LamdaClass<T, U, R> {
		R myCompare(T t, U u);
	}
}
