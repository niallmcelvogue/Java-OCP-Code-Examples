package chapterEight.lambdas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    record Animal(String species, boolean canSwim, boolean canFly) {}
    interface CheckTrait {
        boolean test(Animal animal);
    }

    static class CheckIfFlies implements CheckTrait {
        public boolean test(Animal animal) {
            return animal.canFly();
        }
    }

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("dog", true, false));
        animals.add(new Animal("cat", true, false));
        animals.add(new Animal("bird", true, true));

        print(animals, new CheckIfFlies());
        print(animals, Animal::canSwim);

    }

    private static void print(List<Animal> animals, CheckTrait trait) {
        for(Animal animal : animals) {
            if(trait.test(animal)) {
                System.out.println(animal.species);
            }
        }
    }
}
