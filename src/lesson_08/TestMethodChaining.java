package lesson_08;

public class TestMethodChaining {

    public static void main(String[] args) {
        MethodChaining.Builder builder = new MethodChaining.Builder();

        MethodChaining house = builder.setDoorNum(12)
                .setTopRoofColor("Red")
                .setHouseColor("White")
                .build();

        System.out.println(house);
    }
}
