package chapterEight.functionalInterfaces;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionAndUnaryOperatorExample {
    public static void main(String[] args) {
        Function<String, String> s1 = String::toLowerCase;
        UnaryOperator<String> s2 = String::toLowerCase;

        System.out.println(s1.apply("BANANA"));
        System.out.println(s2.apply("BANANA"));
    }
}
