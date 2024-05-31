package lesson_12;

public class IOSDriver extends AppiumDriver {


    @Override
    protected void initDriver() {
        System.out.println("Init IOS Driver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close IOS Driver");
    }
}
