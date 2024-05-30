package lesson_08;

public class TestHouseWithBuilder {

    public static void main(String[] args) {
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();

        builder.setDoorNum(12);
        builder.setTopRoofColor("Yellow");
        builder.setHouseColor("Blue");

        HouseWithBuilder house = builder.build();

        System.out.println(house);
    }
}
