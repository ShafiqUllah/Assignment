package lab9.part2.prob12;

import java.util.stream.Stream;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {};

    public static MySingletonLazy getInstance() {
        return Stream.ofNullable(instance).findAny().orElseGet(() -> {
            instance = new MySingletonLazy();
            return  instance;
        });
    }

    public static void main(String[] args) {
        System.out.println(MySingletonLazy.getInstance().equals(MySingletonLazy.getInstance()));
    }
}
