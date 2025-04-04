package chapterEight.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("chirp", "chick")); // CHIRP
        System.out.println(b2.apply("chirp","chick")); // CHIRP
    }
}
