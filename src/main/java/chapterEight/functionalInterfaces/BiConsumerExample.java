package chapterEight.functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        BiConsumer<String,Integer> b1 = map::put;
        BiConsumer<String,Integer> b2 = (a,b) -> map.put(a,b);

        b1.accept("Hello", 1);
        b2.accept("World", 2);

        System.out.println(map);
    }
}
