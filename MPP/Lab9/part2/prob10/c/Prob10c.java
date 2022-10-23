package lab9.part2.prob10.c;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Prob10c {
	private static Function<List<Integer>, Stream<Integer>> myIntStreamFnctr = list -> list.stream();

	public static void main(String[] args) {

		List<Integer> myIntStream = Arrays.asList(1, 3, 5, 6, -2, 12, 14, 9);

		// Reuse stream by placing stream generation code inside a method
		cloneStream(myIntStream).max(Integer::compareTo).ifPresent(x -> System.out.println(x));
		cloneStream(myIntStream).min(Integer::compareTo).ifPresent(x -> System.out.println(x));

		// Reuse stream by using lambda Functors
		myIntStreamFnctr.apply(myIntStream).max(Integer::compareTo).ifPresent(x -> System.out.println(x));
		myIntStreamFnctr.apply(myIntStream).min(Integer::compareTo).ifPresent(x -> System.out.println(x));
	}

	public static Stream<Integer> cloneStream(List<Integer> myIntStream) {
		return myIntStream.stream();
	}

}
