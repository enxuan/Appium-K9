package lesson_10_3;

public class Eagle extends Animal implements IMovable, IFlyable{

    public Eagle(String name, int speed) {
        super(name, speed);
    }

    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public boolean movable() {
        return true;
    }
}
