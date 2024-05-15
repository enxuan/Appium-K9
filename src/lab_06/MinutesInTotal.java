package lab_06;

public class MinutesInTotal {

    public static void main(String[] args) {
        String input = "10hrs and 50 minutes";
        String[] separateString = input.split("and");
        String[] numString = new String[2];

        numString[0] = separateString[0].replaceAll("[^0-9]", "");
        numString[1] = separateString[1].replaceAll("[^0-9]", "");

        int totalMinutes = Integer.parseInt(numString[0]) * 60 + Integer.parseInt(numString[1]);
        System.out.println("the total minutes: " + totalMinutes);
    }
}
