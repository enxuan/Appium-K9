package lab_07;

import java.util.Arrays;
import java.util.List;

public class AnimalRasing {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        List<Animal> rasingList = Arrays.asList(horse, tiger, dog);
        Animal winer = horse;

        for (Animal animal : rasingList) {
            animal.startRasing();
            System.out.printf("the animal %s has speed: %d \n", animal.getClass().getSimpleName(), animal.getSpeed());
            if (winer.getSpeed() < animal.getSpeed()) {
                winer = animal;
            }
        }

        System.out.printf("The winer is: %s with speed: %d", winer.getClass().getSimpleName(), winer.getSpeed());

    }
}
