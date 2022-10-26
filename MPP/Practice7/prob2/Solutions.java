package practice7.prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(1);
		listOfInt.add(2);
		listOfInt.add(3);
		listOfInt.add(4);
		listOfInt.add(5);
		listOfInt.add(6);
		listOfInt.add(7);
		listOfInt.add(8);

	

		Predicate<Integer> pOdd = (x) -> x % 2 != 0;

		Predicate<Integer> pPrime = (x) -> {
			for (int i = 2; i <= x / 2; i++) {
				if (x % i == 0)
					return false;
			}
			return true;
		};

	

		System.out.println(Solutions.countIf(listOfInt, pOdd));
		System.out.println(Solutions.countIf(listOfInt, pPrime));
	}

	public static <T> int countIf(Collection<T> c, Predicate<T> p) {

		//Imperative style (you may use generics, for loop, lambdas)
//		int count = 0;
//		for (T elem : c)
//			if (p.test(elem))
//				++count;
//		return count;
		
		//Declarative style (you may use generics, lambdas, and streams without loop)
		return (int) c.stream().filter(p::test).count();
	}

}
