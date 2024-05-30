package lesson_10_3;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void flyableRacing(List<IFlyable> flyableAnimals) {
        flyableAnimals.get(0).flyable();
    }

    public void nonFlyableRacing(List<IMovable> nonFlyableAnimals) {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Meo", 25);
        Cat cat01 = new Cat("Meo con", 25);
        Eagle eagle = new Eagle("dai bang", 50);
        Eagle eagle01 = new Eagle("dai bang", 50);

        new RacingController().flyableRacing(Arrays.asList(eagle, eagle01));
        new RacingController().nonFlyableRacing(Arrays.asList(cat, cat01));
    }
}
