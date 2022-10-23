package lab9.part2.prob9;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.printSquares(4);
	}

	public static void printSquares(int num) {
		IntStream.iterate(1,  x -> x + 2 * (int)Math.sqrt(x) +1).limit(num).forEach(System.out::println);
	}

}
