package lab_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static lab_08.AnimalWithBuilder.Builder;

public class AnimalRasing {

    public static void main(String[] args) {
        // Create animal list
        AnimalWithBuilder tiger = new Builder().setMaxSpeed(60).setName("Tiger").setFlyable(false).build();
        AnimalWithBuilder horse = new Builder().setMaxSpeed(50).setName("Horse").setFlyable(false).build();
        AnimalWithBuilder eagle = new Builder().setMaxSpeed(100).setName("Eagle").setFlyable(true).build();
        AnimalWithBuilder dog = new Builder().setMaxSpeed(40).setName("Dog").setFlyable(false).build();
        AnimalWithBuilder chicken = new Builder().setMaxSpeed(20).setName("Chicken").setFlyable(true).build();
        AnimalWithBuilder cat = new Builder().setMaxSpeed(20).setName("Cat").setFlyable(false).build();

        List<AnimalWithBuilder> animalList = Arrays.asList(tiger, horse, eagle, dog, chicken, cat);

        AnimalRasing rasingController = new AnimalRasing();
        List<AnimalWithBuilder> rasingList = rasingController.getNonFlyableList(animalList);
        System.out.println("The rasing anticipate: ");
        for (AnimalWithBuilder animal : rasingList) {
            System.out.println(animal);
        }
        AnimalWithBuilder winer = rasingController.getWiner(rasingList);
        System.out.println("\n\nThe winer:");
        System.out.println(winer);

    }

    public AnimalWithBuilder getWiner(List<AnimalWithBuilder> list) {
        AnimalWithBuilder winer = list.get(0);
        // If has more than one animal has max speed, get first max speed in list
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getRealSpeed() > winer.getRealSpeed()) {
                winer = list.get(i);
            }
        }

        return winer;
    }

    public List<AnimalWithBuilder> getNonFlyableList(List <AnimalWithBuilder> list) {
        List<AnimalWithBuilder> nonFlyableList = new ArrayList<>();

        for (AnimalWithBuilder animal : list) {
            if (!animal.isFlyable()) {
                nonFlyableList.add(animal);
            }
        }

        return nonFlyableList;
    }
}
