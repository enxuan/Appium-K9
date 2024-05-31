package lesson_12;

public class LaunchAppTest {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = DriverFactory.getAppiumDriver(Platform.ANDROID);

        appiumDriver.initDriver();
        appiumDriver.closeDriver();
    }
}
