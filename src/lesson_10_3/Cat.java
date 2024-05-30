package lesson_10_3;

public class Cat extends Animal implements IMovable {

    public Cat(String name, int speed) {
        super(name, speed);
    }

    @Override
    public boolean movable() {
        return true;
    }
}
