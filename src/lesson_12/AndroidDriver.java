package lesson_12;

public class AndroidDriver extends AppiumDriver {


    @Override
    protected void initDriver() {
        System.out.println("Init Android Driver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close Android Driver");
    }
}
