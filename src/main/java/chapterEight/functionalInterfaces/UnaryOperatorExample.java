package chapterEight.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chirp")); // CHIRP
    }
}
