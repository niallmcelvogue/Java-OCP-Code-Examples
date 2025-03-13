package chapterEight.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = (String x) -> System.out.println(x);

        c1.accept("Hello");
        c2.accept("World");
    }
}
