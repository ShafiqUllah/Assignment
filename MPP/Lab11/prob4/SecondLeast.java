package lab11.prob4;

import java.util.Arrays;
import java.util.List;

public class SecondLeast {

	private static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		return list.stream().sorted().skip(list.size() > 1 ? 1 : 0).findFirst().get();
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(-6, 14, -200, -700, 7, 4, 5, -5, -2000);
		System.out.println(secondSmallest(ints));

		List<String> strs = Arrays.asList("c", "aaa", "C", "a", "B", "Test", "Abeni", "Kebede", "Zak");
		System.out.println(secondSmallest(strs));
	}
}
