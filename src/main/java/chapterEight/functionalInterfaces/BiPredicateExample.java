package chapterEight.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String,String> b1 = String::endsWith;
        BiPredicate<String,String> b2 = (a,b) -> a.endsWith(b);

        System.out.println(b1.test("221B Baker Street", "Street"));
        System.out.println(b1.test("221B Baker Street", "London"));
        System.out.println(b2.test("221B Baker Street", "Street"));
        System.out.println(b2.test("221B Baker Street", "London"));
    }
}
