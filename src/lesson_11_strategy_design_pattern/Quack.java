package lesson_11_strategy_design_pattern;

public class Quack implements QuackBehavior{
    @Override
    public void quackable() {
        System.out.println("Quack Quack");
    }
}
