package lab8.Prob4;


import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();

		System.out.println(String.format("Number " + good.countWords(Folks.friends, 'a', 't', 5)));

	}

	public int countWords(List<String> words, char c, char d, int len) {
		List<String> t = words.stream().map(s -> s.toLowerCase()).filter(s -> {
			return s.contains(c + "") && !s.contains(d + "");
		}).filter(s-> s.length() == len)
				.collect(Collectors.toList());

		System.out.println(t.toString());
		return t.size();
	}


}
