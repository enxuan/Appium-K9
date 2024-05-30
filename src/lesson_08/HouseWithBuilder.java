package lesson_08;

public class HouseWithBuilder {

    private int doorNum;
    private String topRoofColor;
    private String houseColor;

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

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder) {
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        houseColor = builder.houseColor;
    }

    public static class Builder {
        private int doorNum;
        private String topRoofColor;
        private String houseColor;

        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public void setHouseColor(String houseColor) {
            this.houseColor = houseColor;
        }

        public HouseWithBuilder build() {
            return new HouseWithBuilder(this);
        }
    }
}
