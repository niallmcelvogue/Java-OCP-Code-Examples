package chapterEight.lambdas;

import java.util.function.Consumer;

public class LambdaFinalExample {
        private String color;

        public void caw(String name) {
            String volume = "loudly";
            name = "Caty";
            color = "black";

            String finalName = name;
            Consumer<String> consumer = s -> {
                System.out.println(finalName + " says " + volume + " that she is " + color);
                // volume = "softly"; // This line would cause a compile error due to effectively final variable
            };

            consumer.accept("anything");
        }

        public static void main(String[] args) {
            LambdaFinalExample example = new LambdaFinalExample();
            example.caw("Dummy");
        }
    }
