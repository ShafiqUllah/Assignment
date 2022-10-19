package lab8.Prob4;

import java.util.Arrays;
import java.util.List;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		list.forEach(x -> {
			System.out.println(x.toUpperCase());
		});

		PrintUpperCase<String> func = (x) -> System.out.println(x.toUpperCase());
		list.forEach(x -> func.writeThisInUpperCase(x));

	}

	public interface PrintUpperCase<T> {
		void writeThisInUpperCase(T t);
	}

}