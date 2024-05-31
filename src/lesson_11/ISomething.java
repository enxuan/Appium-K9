package lesson_11;

import java.util.Comparator;

public interface ISomething extends Comparable, Comparator {

    void doSth();
    default void doAnotherThing() {

    }

    static void doAnything() {

    }
}
