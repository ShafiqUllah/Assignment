package practice4;

import java.util.function.BiFunction;

//(String s1, String s2) -> s1.compareTo(s2)
public class Problem1 {
	// name and type of lambda goes here
	BiFunction<String, String, Integer> func1 = (String s1, String s2) -> s1.compareTo(s2);

	// representing lambda as a method reference
	BiFunction<String, String, Integer> func2 = String::compareTo;

	// representing lambda as a static nested class
	LamdaClass<String, String, Integer> ILamdaClass = (s1, s2) -> {
		return s1.compareTo(s2);
	};

	// evaluate with String inputs: “Hello”, “Allo”
	public void evaluator() {
		String a ="Hello";
		String b = "Allo";
		
		System.out.println(func1.apply(a, b));
		System.out.println(func2.apply(a, b));
		System.out.println(ILamdaClass.compareTheString(a, b));
		
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

	public static interface LamdaClass<T, U, R> {
		R compareTheString(T t, U u);
	}
}
