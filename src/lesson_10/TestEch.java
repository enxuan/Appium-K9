package lesson_10;

public class TestEch {

    public static void main(String[] args) {
        Ech ech;

        //Polymorphism: transition into many forms
        boolean isEnoughTime = true;
        if (isEnoughTime) {
            ech = new NongNoc();
        } else {
            ech = new TrungEch();
        }
    }
}
