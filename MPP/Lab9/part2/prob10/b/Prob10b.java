package lab9.part2.prob10.b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob10b {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
