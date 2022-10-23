package lab9.part1.prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {

	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

	}

	void printFirstNPrimes(long n) {
		final Stream<Integer> stream = Stream.iterate(2, PrimeUtil::next);
		System.out.println( stream.limit(n).collect(Collectors.toList()));
	}

}

class PrimeUtil {

	public static int next(int counter) {

		// Keep looping until you find the next prime number
		while (!isPrime(++counter)) {

		}

		return counter;
	}

	// Checks if the specified number is a prime number
	public static boolean isPrime(int number) {
		// <= 1 is not a prime number
		if (number <= 1) {
			return false;
		}

		// 2 is a prime number
		if (number == 2) {
			return true;
		}

		for (int counter = 2; counter <= number / 2; counter++) {
			if (number % counter == 0) {
				return false;
			}
		}

		return true;
	}
}
