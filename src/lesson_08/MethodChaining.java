package lesson_08;

public class MethodChaining {

    private int doorNum;
    private String topRoofColor;
    private String houseColor;

    public MethodChaining() {}

    protected MethodChaining(Builder builder) {
        this.doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        houseColor = builder.houseColor;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getHouseColor() {
        return houseColor;
    }

    @Override
    public String toString() {
        return "Builder{" + "doorNum=" + doorNum + ", topRoofColor='" + topRoofColor + '\'' + ", houseColor='" + houseColor + '\'' + "}";
    }

    public static class Builder {
        private int doorNum;
        private String topRoofColor;
        private String houseColor;

        public Builder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setHouseColor(String houseColor) {
            this.houseColor = houseColor;
            return this;
        }

        public MethodChaining build() {
            return new MethodChaining(this);
        }
    }
}
