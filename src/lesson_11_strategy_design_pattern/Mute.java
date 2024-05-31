package lesson_11_strategy_design_pattern;

public class Mute implements QuackBehavior{

    @Override
    public void quackable() {
        System.out.println("Mute...");
    }
}
