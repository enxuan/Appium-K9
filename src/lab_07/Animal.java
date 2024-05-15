package lab_07;

import java.security.SecureRandom;

public class Animal {

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    int MAX_SPEED;

    public int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startRasing() {
        setSpeed(new SecureRandom().nextInt(getMAX_SPEED()));
    }
}
