package lab_08;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private int maxSpeed;
    private int realSpeed;
    private boolean flyable;

    private String name;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRealSpeed() {
        return realSpeed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public AnimalWithBuilder(){}

    protected AnimalWithBuilder(Builder build) {
        maxSpeed = build.maxSpeed;
        name = build.name;
        flyable = build.isFlyable;
        realSpeed = new SecureRandom().nextInt(maxSpeed);
    }

    @Override
    public String toString() {
        return "the animal " + name +
                " has speed: " + realSpeed;
    }

    public static class Builder {
        private int maxSpeed;
        private boolean isFlyable;
        private String name;

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            isFlyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}
