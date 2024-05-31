package lesson_11_strategy_design_pattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quackable() {
        System.out.println("Squeak Squeak");
    }
}
