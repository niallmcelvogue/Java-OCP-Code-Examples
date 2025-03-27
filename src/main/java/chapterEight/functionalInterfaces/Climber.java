package chapterEight.functionalInterfaces;
@FunctionalInterface
interface Climb {
    boolean isTooHigh(int height, int width);
    String toString();
    boolean equals(Object o);
}

public class Climber {
    public static void main(String[] args) {
        check((h, m) -> h < 1, 5);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}